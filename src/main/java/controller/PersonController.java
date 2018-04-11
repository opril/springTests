package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Person;

@Controller
public class PersonController {
	@RequestMapping(value = "/person", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("personHome", "person", new Person());
    }
 
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(@ModelAttribute("person")Person person, 
      BindingResult result, ModelMap model) {
        model.addAttribute("name", person.getName());
        model.addAttribute("id", person.getId());
        return "person";
    }
}
