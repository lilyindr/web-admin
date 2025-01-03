package com.web_admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_admin.Models.CoreCustomerPic;
import com.web_admin.Models.CoreCustomerPicCompKey;


@Repository
public interface ICoreCustomerPicRepository extends JpaRepository<CoreCustomerPic,CoreCustomerPicCompKey>{

}
