package my.restserver.controller;

import my.restserver.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan(basePackages={"my.restserver.service"})
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/task0users")
	public ModelAndView getAllUsers(){
		ModelAndView modelAndView = new ModelAndView("showUsers");
		modelAndView.addObject("users", userService.getAll());
		return modelAndView;
	}
}
