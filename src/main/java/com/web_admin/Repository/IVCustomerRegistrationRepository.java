package com.web_admin.Repository;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web_admin.Models.VCustomerRegistration;

public interface IVCustomerRegistrationRepository extends JpaRepository<VCustomerRegistration, BigDecimal>{
	
	public List<VCustomerRegistration> findByCcregId(BigDecimal regId);

}
