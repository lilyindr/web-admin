package com.web_admin.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_admin.Models.CoreCustomerRegistration;
import com.web_admin.Repository.ICoreCustomerRegistrationRepository;


@Service
public class ServiceCoreCustomerRegistration {
	
	@Autowired
	ICoreCustomerRegistrationRepository repoccReg;
   
	public List<CoreCustomerRegistration> getCcRegList(){
		return repoccReg.findAll();
	}
	
	public String saveUpdateReg( CoreCustomerRegistration reg) {
		repoccReg.save(reg);
		return "Submit Successfully";
	}

}
