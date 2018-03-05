package io.github.gacus007.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.gacus007.DAOs.DAOCustomer;

@Controller
public class HomeController {
	
	@Autowired
	private DAOCustomer daoCustomer;
	
	@RequestMapping("/")
	public String index(Model model) {
		
		model.addAttribute("customers", daoCustomer.getCustomers());
		
		return "index";
		
		
	}
	
}
