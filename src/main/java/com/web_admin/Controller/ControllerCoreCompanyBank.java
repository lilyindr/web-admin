package com.web_admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_admin.Models.CoreCompanyBank;
import com.web_admin.Services.ServiceCoreCompanyBank;

@RestController
public class ControllerCoreCompanyBank {
	
	@Autowired
	ServiceCoreCompanyBank servCcbank;
	
	@GetMapping("/webadmin/getCcbankListAll")
	public List<CoreCompanyBank> getCcbankListAll(){
		return servCcbank.getCcbankListAll();
	}

}
