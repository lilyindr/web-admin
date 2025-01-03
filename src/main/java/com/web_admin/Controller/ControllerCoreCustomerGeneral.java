package com.web_admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_admin.Models.CoreCustomerGeneral;
import com.web_admin.Services.ServiceCoreCustomerGeneral;

@RestController
public class ControllerCoreCustomerGeneral {
	
	@Autowired
	ServiceCoreCustomerGeneral servCCUST;
	
	@GetMapping("/webadmin/exeLogin")
	public String exeCheckLogin (String userid , String userpass,  String macaddress, String pmsg) {
		System.out.println("bbbbb :"+userid);     
		return servCCUST.exeCheckLogin(userid, userpass, macaddress, pmsg);
	}
	
	@GetMapping("/webadmin/getCustAllList")
	public List<CoreCustomerGeneral> getCustomerAllList(){
		return servCCUST.getCustomerAllList();
	}

}
