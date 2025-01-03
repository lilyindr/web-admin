package com.web_admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_admin.Models.CoreMstAdminStatus;
import com.web_admin.Services.ServiceCoreMstAdminStatus;

@RestController
public class ControllerCoreMstAdminStatus {
	
	@Autowired
	ServiceCoreMstAdminStatus servCmas;
	
	@GetMapping("/webadmin/getCmasListAll")
	public List<CoreMstAdminStatus> getCmasListAll(){
		return servCmas.getCmasListAll();
	}

}
