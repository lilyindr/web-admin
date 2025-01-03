package com.web_admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web_admin.Models.CoreCustomerBank;
import com.web_admin.Models.CoreCustomerBankCompKey;

public interface ICoreCustomerBankRepository extends JpaRepository<CoreCustomerBank,CoreCustomerBankCompKey>{

}
