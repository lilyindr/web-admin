package com.web_admin.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_admin.Models.CoreCompanySmtp;
import com.web_admin.Repository.ICoreCompanySmptRepository;

@Service
public class ServiceCoreCompanySmtp {
	
	@Autowired
	ICoreCompanySmptRepository repoCcsmtp;
	
	public List<CoreCompanySmtp> getCcsmtpListAll(){
		return repoCcsmtp.findAll();
	}

}
