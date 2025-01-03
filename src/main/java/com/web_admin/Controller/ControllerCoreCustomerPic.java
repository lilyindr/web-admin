package com.web_admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.web_admin.Models.CoreCustomerPic;
import com.web_admin.Services.ServiceCoreCustomerPic;


@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerCoreCustomerPic {
	
	@Autowired
	ServiceCoreCustomerPic servCcPic;
	
	@GetMapping("/webadmin/getCcPicListAll")
	public List<CoreCustomerPic> getCcPicListAll(){
		return servCcPic.getCcPicListAll();
	}

}
