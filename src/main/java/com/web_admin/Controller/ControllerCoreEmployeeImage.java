package com.web_admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_admin.Models.CoreEmployeeImage;
import com.web_admin.Services.ServiceCoreEmployeeImage;

@RestController
public class ControllerCoreEmployeeImage {
	
	@Autowired
	ServiceCoreEmployeeImage servCeimg;
	
	@GetMapping("/webadmin/getCeimgListAll")
	public List<CoreEmployeeImage> getCeimgListAll(){
		return servCeimg.getCeimgListAll();
	}

}
