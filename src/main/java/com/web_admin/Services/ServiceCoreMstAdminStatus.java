package com.web_admin.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_admin.Models.CoreMstAdminStatus;
import com.web_admin.Repository.ICoreMstAdminStatusRepository;

@Service
public class ServiceCoreMstAdminStatus {
	
	@Autowired
	ICoreMstAdminStatusRepository repoCmas;
	
	public List<CoreMstAdminStatus> getCmasListAll(){
		return repoCmas.findAll();
	}

}
