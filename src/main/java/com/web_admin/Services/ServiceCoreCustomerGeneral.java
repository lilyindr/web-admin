package com.web_admin.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_admin.Models.CoreCustomerGeneral;
import com.web_admin.Repository.ICoreCustomerGeneralRepository;


@Service
public class ServiceCoreCustomerGeneral {
	
	@Autowired
	ICoreCustomerGeneralRepository repoCCUST;
	
	public String exeCheckLogin(String userid , String userpass,  String macaddress, String pmsg ) {
		return repoCCUST.exeCheckLogin(userid, userpass, macaddress, pmsg);
	}
	
	public List<CoreCustomerGeneral> getCustomerAllList(){
		return repoCCUST.findAll();
	}

}
