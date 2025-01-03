package com.web_admin.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_admin.Models.CoreCompanyBank;
import com.web_admin.Repository.ICoreCompanyBankRepository;

@Service
public class ServiceCoreCompanyBank {
	
	@Autowired
	ICoreCompanyBankRepository repoCcbank;
	
	public List<CoreCompanyBank> getCcbankListAll(){
		return repoCcbank.findAll();
	}

}
