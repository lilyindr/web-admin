package com.web_admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web_admin.Models.CoreCustomerRegistration;
import com.web_admin.Services.ServiceCoreCustomerRegistration;

@RestController
public class ControllerCoreCustomerRegistration {
	
	@Autowired
	ServiceCoreCustomerRegistration servccReg;
	
	@GetMapping("/webadmin/getCustRegList")
	public List<CoreCustomerRegistration> getCcRegList(){
		return servccReg.getCcRegList();
	}
	
	@PostMapping("/reg/saveupdreg")
	public String saveUpdateMstJurnal(@RequestBody CoreCustomerRegistration reg) {
		return servccReg.saveUpdateReg(reg);
	
	}

}
