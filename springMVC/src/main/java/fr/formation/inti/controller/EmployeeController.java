package fr.formation.inti.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.formation.inti.model.Employee;


@Controller
public class EmployeeController {
	
	private Map<Integer, Employee> emps = null;

	@Autowired
	@Qualifier("employeeValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	public EmployeeController() {
		emps = new HashMap<Integer, Employee>();
	}

	@ModelAttribute("employee")
	public Employee createEmployeeModel() {
		// ModelAttribute value should be same as used in the empSave.jsp
		return new Employee();
	}

	@RequestMapping(value = "/emp/save", method = RequestMethod.GET)
	public String saveEmployeePage(Model model) {
		
		return "empSave";
	}

	@RequestMapping(value = "/emp/save.do", method = RequestMethod.POST)
	public String saveEmployeeAction(
			@ModelAttribute("employee") @Validated Employee employee,
			BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "empSave";
		}
		
		model.addAttribute("emp", employee);
		emps.put(employee.getId(), employee);
		return "empSaveSuccess";
	}
	
//	@GetMapping("/international")
//    public String getInternationalPage() {
//        return "international";
//    }
}
