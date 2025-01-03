package com.web_admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_admin.Models.CoreCustomerAddress;
import com.web_admin.Models.CoreCustomerAddressCompKey;


@Repository
public interface ICoreCustomerAddressRepository extends JpaRepository<CoreCustomerAddress,CoreCustomerAddressCompKey>{

}
