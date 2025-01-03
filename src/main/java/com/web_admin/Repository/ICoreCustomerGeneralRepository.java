package com.web_admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.web_admin.Models.CoreCustomerGeneral;


@Repository
public interface ICoreCustomerGeneralRepository extends JpaRepository<CoreCustomerGeneral, String>{
	
	//@Query("select s.glCcDesc from GlCcMaster s where s.glCcCode=?1")
		//public String getGlCcMstDesc(String glCcCode);
		@Procedure(procedureName = "p_check_login")
		public String exeCheckLogin(String userid , String userpass,  String macaddress, String pmsg);

}
