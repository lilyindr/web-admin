package com.web_admin.Services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_admin.Models.VCustomerRegistration;
import com.web_admin.Repository.IVCustomerRegistrationRepository;

@Service
public class ServiceVCustomerRegistration {
	@Autowired
	IVCustomerRegistrationRepository repoVcrg;
	
	public List<VCustomerRegistration> getVCustomer(BigDecimal regId){
		return repoVcrg.findByCcregId(regId);		
	}
}
