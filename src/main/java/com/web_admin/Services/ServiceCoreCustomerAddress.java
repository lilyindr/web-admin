package com.web_admin.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_admin.Models.CoreCustomerAddress;
import com.web_admin.Repository.ICoreCustomerAddressRepository;


@Service
public class ServiceCoreCustomerAddress {
	
	@Autowired
	ICoreCustomerAddressRepository repoCcAddr;
	
	public List<CoreCustomerAddress> getCcAddrListAll(){
		return repoCcAddr.findAll();
	}

}
