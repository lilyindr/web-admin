package com.web_admin.Controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_admin.Models.CoreCompany;
import com.web_admin.Models.VCustomerRegistration;
import com.web_admin.Services.ServiceCoreCompany;
import com.web_admin.Services.ServiceVCustomerRegistration;

@RestController
public class ControllerVCustomerRegistration {
	@Autowired
	ServiceVCustomerRegistration servVcrg;
	
	@GetMapping("/admin/getRegistrationAll")
	public List<VCustomerRegistration> geVCustRegListAll(){
		return servVcrg.getVCustomerAll();
	}
	
	@GetMapping("/admin/getRegistrationById")
	public List<VCustomerRegistration> geVCustRegListByID(BigDecimal regId){
		return servVcrg.getVCustomer(regId);
	}
	
	@GetMapping("/admin/SubmitRegistrationEmpl")
	public String SubmitRegistEmpl(Integer p_userid, String p_id){
		return servVcrg.SubmitRegVerEmpl(p_userid, p_id);
	}
	
	
}
