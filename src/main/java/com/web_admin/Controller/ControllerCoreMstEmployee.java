package com.web_admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_admin.Models.CoreMstEmployee;
import com.web_admin.Services.ServiceCoreMstEmployee;

@RestController
public class ControllerCoreMstEmployee {
	
	@Autowired
	ServiceCoreMstEmployee servCme;
	
	@GetMapping("/webadmin/getCmeListAll")
	public List<CoreMstEmployee> getCmeListAll(){
		return servCme.getCmeListAll();
	}

}
