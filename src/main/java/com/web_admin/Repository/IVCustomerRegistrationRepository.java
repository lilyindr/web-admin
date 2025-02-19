package com.web_admin.Repository;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.web_admin.Models.VCustomerRegistration;

@Repository
public interface IVCustomerRegistrationRepository extends JpaRepository<VCustomerRegistration, BigDecimal>{
	
	public List<VCustomerRegistration> findByCcregId(BigDecimal regId);
	
	/*@Modifying
	@Procedure(procedureName = "p_customer_reg_verify_empl")
	public String SubmitRegVerEmpl(String p_userid, String p_id,String p_msg);*/

}
