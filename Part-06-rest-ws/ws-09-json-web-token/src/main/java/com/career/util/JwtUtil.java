package com.career.util;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {

	private static final String SECERATE_KEY = "India@11";
	
	public Boolean isTokenExpired(String token) {
		  Date expiration = extractExpiration(token);
		  boolean isExpired = expiration.before(new Date());
		  return isExpired;
	}

	
	// Token Generation Process 2
	public String generateToken(UserDetails userDetails) {
		Map<String, Object> claims = new HashMap<>();
		return createToken(claims, userDetails.getUsername());
	}

	// Token Generation Process 1
	public String createToken(Map<String, Object> claims, String subject) {
		
		System.out.println("encoded :: "+Base64.getEncoder().encode(SECERATE_KEY.getBytes()));
		return Jwts.builder().setClaims(claims).setSubject(subject)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() +1000 * 60 * 60 * 10))
				.signWith(SignatureAlgorithm.HS512, Base64.getEncoder().encode(SECERATE_KEY.getBytes())).compact();
	}
	
	
	
	public String extractUsername(String token) {
		return extractClaim(token, Claims::getSubject);
	}
	public Date extractExpiration(String token) {
		return extractClaim(token, Claims::getExpiration);
	}
	
	//validation process 3
	
	public Boolean validateToken(String token,UserDetails userDetails) {
		String extractUsername = extractUsername(token);
		return (extractUsername.equalsIgnoreCase(userDetails.getUsername()) && !isTokenExpired(token));
	}
	
	//validatation proecess 2
	
	public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
		Claims extractAllClaims = extractAllClaims(token);	
		return claimsResolver.apply(extractAllClaims);
	}
	
	//get validate process 1
	private Claims extractAllClaims(String token) {	
		return Jwts.parser().setSigningKey(Base64.getEncoder().encode(SECERATE_KEY.getBytes())).parseClaimsJws(token).getBody();
	}
	
	
	
	
	

}
