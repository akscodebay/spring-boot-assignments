package com.example.Controller;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.BankBranches.*;
import com.example.ass3.HealthChecker;

@Controller
public class RequestMapper {
	
	List<BranchDetails> branchDetails = new ArrayList<>();
	List<ServicesProvided> services = new ArrayList<>();
	
	HealthChecker healthChecker = new HealthChecker();
	
	@PostConstruct
	private void valueIntializrBranch() {
		branchDetails.add(new BranchDetails("plot 1, Habbel", 9514000012l));
		branchDetails.add(new BranchDetails("plot 2, Agra", 1544624222));
		branchDetails.add(new BranchDetails("plot 3, Silk Board", 1544624223));
		branchDetails.add(new BranchDetails("plot 4, K R market", 1544624224));
		branchDetails.add(new BranchDetails("plot 5, Marathalli", 1544624225));
		branchDetails.add(new BranchDetails("plot 6, Whitefield", 1544624226));
		branchDetails.add(new BranchDetails("plot 7, Electronic City", 1544624227));
		branchDetails.add(new BranchDetails("plot 8, JayaNagar", 1544624228));
		branchDetails.add(new BranchDetails("plot 9, Tin Factory", 1544624220));
		branchDetails.add(new BranchDetails("plot 10, Magestic", 1544624210));
	}
	
	@PostConstruct
	private void valueIntializrService() {
		services.add(new ServicesProvided("Anytime Anywhere Banking","Experience banking at the tips of your "
				+ "hands with our mpbile banking app"));
		services.add(new ServicesProvided("Unlimited Cash","No limit on Debit Card Transactions"));
		services.add(new ServicesProvided("Secure","Bank with world best secure banks"));
		services.add(new ServicesProvided("Less EMI","Only 6% loan Interest"));
		services.add(new ServicesProvided("Matrix ","Trade on the go with MATRIX mand earn more"));
		services.add(new ServicesProvided("No charges","No Charges on sms and debit card"));
		services.add(new ServicesProvided("More Interest","Save with us and get 5% interest"));
		services.add(new ServicesProvided("Be Insured","10 Lakh insurance with your Gold Saving Account"));
		services.add(new ServicesProvided("Super","Get super coins on online shoppping. 1 super = 1rs."));
		services.add(new ServicesProvided("24*7 Helpline","Our Customer Support team is always there to hear you"));	
		
	}
	
	@RequestMapping("/")
	public String bankDetails(ModelMap map) {
		map.put("branches", branchDetails);
		return "index";
	}
	
	@RequestMapping("/services")
	public String serviceDetails(ModelMap map) {
		map.put("services", services);
		return "services";
	}
	
	@RequestMapping("/health")
	public String healthChecker(Model model) {
		String[] status = healthChecker.health().toString().split(" ");
		model.addAttribute("status", status[0]);
		return "health";
	}
}
