package com.career.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.career.dto.AuthReq;
import com.career.dto.AuthResponse;
import com.career.util.JwtUtil;

@RestController
public class AuthResource {

	@Autowired
	private JwtUtil jwtUtil;

	/*
	 * { username:shreya password:wety * }
	 */

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UserDetailsService userDetailsService;

	@PostMapping("/token/")
	public ResponseEntity<AuthResponse> generateToken(@RequestBody AuthReq req) throws Exception {

		authenticate(req.getUsername(), req.getPassword());
		final UserDetails userDetails = userDetailsService.loadUserByUsername(req.getUsername());
		final String token = jwtUtil.generateToken(userDetails);
		return ResponseEntity.ok(new AuthResponse(token));

	}

	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}

	/*
	 * {
	 * 
	 * "token":"asdfghjsdfghj", "enable":true
	 * 
	 * }
	 */
}
