package com.web_admin.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_admin.Models.CoreEmployeeImage;
import com.web_admin.Repository.ICoreEmployeeImageRepository;

@Service
public class ServiceCoreEmployeeImage {
	
	@Autowired
	ICoreEmployeeImageRepository repoCeimg;
	
	public List<CoreEmployeeImage> getCeimgListAll(){
		return repoCeimg.findAll();
	}

}
