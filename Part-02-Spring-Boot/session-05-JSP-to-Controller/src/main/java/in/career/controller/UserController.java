package in.career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.career.formbindings.UserFormBinding;

@Controller
public class UserController {

	@GetMapping("/userForm")
	public String saveUser(UserFormBinding user, Model model) {

		System.out.println(user);

		return "saveUser";
	}

//	@GetMapping("/")
//	public String loadUser(Model model) {
//		UserFormBinding user = new UserFormBinding();
//		model.addAttribute("name", "Santosh");
//		return "index";
//	}
	
	/**
	 * This is a method which will return according dbb
	 * @return
	 */
	
	@GetMapping("/")
	public ModelAndView getProduct()
	{
		
		ModelAndView mav=new ModelAndView();
		UserFormBinding users=new   UserFormBinding();
		users.setPassword("ghjkl");
		users.setUserName("ghjkl");
		mav.addObject("users", users);
		mav.setViewName("index");
		return mav;
	}
}
