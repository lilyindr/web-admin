package com.web_admin.Services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_admin.Models.VCustomerRegistration;
import com.web_admin.Repository.IVCustomerRegistrationRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class ServiceVCustomerRegistration {
	@Autowired
	IVCustomerRegistrationRepository repoVcrg;
	
	public List<VCustomerRegistration> getVCustomerAll(){
		return repoVcrg.findAll();		
	}
	
	public List<VCustomerRegistration> getVCustomer(BigDecimal regId){
		return repoVcrg.findByCcregId(regId);		
	}
	
	/*public String SubmitRegistEmpl(String p_userid, String p_id,String p_msg) {		
		return repoVcrg.SubmitRegVerEmpl(p_userid, p_id, p_msg);
	}*/
	
	@PersistenceContext
    private EntityManager entityManager;
	
    public String SubmitRegVerEmpl(Integer p_userid, String p_id) {
	//String passEnc = passwordEncoder.encode(userPass);
	String pmsg = "";
	//System.out.println("sssssssssss :"+passEnc);
    StoredProcedureQuery query = entityManager.createStoredProcedureQuery("irasia.p_customer_reg_verify_empl");
    query.registerStoredProcedureParameter(1, Integer.class, ParameterMode.IN);
    query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
    query.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
    query.setParameter(1, p_userid);
    query.setParameter(2, p_id);
    query.execute();
    String checkok = (String) query.getOutputParameterValue(3);
    System.out.println("sssssssssss2222222222 :"+checkok);
    return (String) query.getOutputParameterValue(3);
    /*if (checkok.equals("OK")) {
    	
    	AuthRequest authRequest = new AuthRequest();
        authRequest.setUsername(p_userid);
        authRequest.setPassword(p_id);
        return authController.getToken(authRequest) ;
    }else {
    	return checkok;
   }*/

}
	
}
