package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloWorldController {
	String message = "bla bla bla";
	
	@GetMapping("/hello")
	public String showMessage(Model model) {
		model.addAttribute("name", "1");
		model.addAttribute("message", message);
		return "helloworld";
	}
	
	@PostMapping("/hello")
	public String showMessagePost(@ModelAttribute String message) {
		return "helloworld";
	}
}
