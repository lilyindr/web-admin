package com.web_admin.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_admin.Models.CoreCustomerBank;
import com.web_admin.Repository.ICoreCustomerBankRepository;

@Service
public class ServiceCoreCustomerBank {
	
	@Autowired
	ICoreCustomerBankRepository repoCcba;
	
	public List<CoreCustomerBank> getCcbaListAll(){
		return repoCcba.findAll();
	}

}
