package com.web_admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_admin.Models.CoreCustomerAddress;
import com.web_admin.Services.ServiceCoreCustomerAddress;

@RestController
public class ControllerCoreCustomerAddress {
	
	@Autowired
	ServiceCoreCustomerAddress repoCcAddr;
	
	@GetMapping("/webadmin/getCcAddrListAll")
	public List<CoreCustomerAddress> getCcAddrListAll(){
		return repoCcAddr.getCcAddrListAll();
	}

}
