package com.web_admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_admin.Models.CoreCompanySmtp;
import com.web_admin.Services.ServiceCoreCompanySmtp;

@RestController
public class ControllerCoreCompanySmpt {
	
	@Autowired
	ServiceCoreCompanySmtp servCcsmtp;
	
	@GetMapping("/webadmin/getCcsmtpListAll")
	public List<CoreCompanySmtp> getCcsmtpListAll(){
		return servCcsmtp.getCcsmtpListAll();
	}

}
