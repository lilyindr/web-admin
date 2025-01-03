package com.web_admin.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_admin.Models.CoreMstEmployee;
import com.web_admin.Models.CoreMstEmployeeCompKey;

@Repository
public interface ICoreMstEmployeeRepository extends JpaRepository<CoreMstEmployee,CoreMstEmployeeCompKey>{

}
