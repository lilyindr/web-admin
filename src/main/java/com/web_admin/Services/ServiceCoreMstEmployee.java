package com.web_admin.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_admin.Models.CoreMstEmployee;
import com.web_admin.Repository.ICoreMstEmployeeRepository;

@Service
public class ServiceCoreMstEmployee {
	
	@Autowired
	ICoreMstEmployeeRepository repoCme;
	
	public List<CoreMstEmployee> getCmeListAll(){
		return repoCme.findAll();
	}

}
