package com.web_admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_admin.Models.CoreCompany;
import com.web_admin.Services.ServiceCoreCompany;

@RestController
public class ControllerCoreCompany {
	
	@Autowired
	ServiceCoreCompany servCcom;
	
	@GetMapping("/webadmin/getCcomListAll")
	public List<CoreCompany> getCcomListAll(){
		return servCcom.getCcomListAll();
	}

}
