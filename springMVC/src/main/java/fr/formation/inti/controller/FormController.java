package fr.formation.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import fr.formation.inti.model.Peoples;

@Controller
public class FormController {

	@RequestMapping(value = "/people", method = RequestMethod.GET)
	public ModelAndView people() {
		return new ModelAndView("people","command", new Peoples());
	}
	
	 @ModelAttribute("people")
	   public Peoples createPeopleModel() {	
	      return new Peoples();
	   }
	
	@RequestMapping(value="/addForm", method=RequestMethod.POST)
	public String addForm(@Validated @ModelAttribute("SpringWeb")Peoples form,BindingResult bindingResult, ModelMap model) {
		 if (bindingResult.hasErrors()) {
	         return "error";
	      }
		model.addAttribute("form", form);
		
		
		return "addForm";
	}
	
	@RequestMapping("/testParam")
	@ResponseBody
	public String test(@RequestParam("id") Integer id) {
		
		return "bonjour Yohan "+id;
	}
}
