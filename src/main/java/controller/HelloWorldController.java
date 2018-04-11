package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	String message = "bla bla bla";
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String showMessage(Model model) {
		model.addAttribute("name", "1");
		model.addAttribute("message", message);
		
		System.out.println("in get controller . . .");
		return "helloworld";
	}
}
