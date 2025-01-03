package com.web_admin.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_admin.Models.CoreCustomerPic;
import com.web_admin.Repository.ICoreCustomerPicRepository;


@Service
public class ServiceCoreCustomerPic {
	
	@Autowired
	ICoreCustomerPicRepository repoCcPic;
	
	public List<CoreCustomerPic> getCcPicListAll(){
		return repoCcPic.findAll();
	}

}
