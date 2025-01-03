package com.web_admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_admin.Models.CoreCustomerRegistration;
import com.web_admin.Models.CoreCustomerRegistrationCompKey;


@Repository
public interface ICoreCustomerRegistrationRepository extends JpaRepository<CoreCustomerRegistration, CoreCustomerRegistrationCompKey>{

}
