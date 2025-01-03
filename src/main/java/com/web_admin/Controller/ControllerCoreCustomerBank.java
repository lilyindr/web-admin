package com.web_admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_admin.Models.CoreCustomerBank;
import com.web_admin.Services.ServiceCoreCustomerBank;

@RestController
public class ControllerCoreCustomerBank {
	
	@Autowired
	ServiceCoreCustomerBank servCcba;
	
	@GetMapping("/webadmin/getCcbaListAll")
	public List<CoreCustomerBank> getCcbaListAll(){
		return servCcba.getCcbaListAll();
	}

}
