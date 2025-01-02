package com.web_admin.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_admin.Models.CoreCompany;
import com.web_admin.Repository.ICoreCompanyRepository;

@Service
public class ServiceCoreCompany {
	
	@Autowired
	ICoreCompanyRepository repoCcom;
	
	public List<CoreCompany> getCcomListAll(){
		return repoCcom.findAll();
	}

}
