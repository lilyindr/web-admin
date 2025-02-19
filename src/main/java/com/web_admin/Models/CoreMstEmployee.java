package com.web_admin.Models;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "core_mst_employee")
@IdClass(CoreMstEmployeeCompKey.class)
public class CoreMstEmployee {
	
	@Id
	@Column(name="cme_empl_nik", length=20, nullable = false)
	private String cmeEmplNik;
	
	@Column(name="cme_empl_name", length=60)
	private String cmeEmplName;
	
	@Column(name="cme_empl_birth_date")
	private Date cmeEmplBirthDate;
	
	@Column(name="cme_empl_birth_place", length=40)
	private String cmeEmplBirthPlace;
	
	@Column(name="cme_empl_address", length=60)
	private String cmeEmplAddress;
	
	@Column(name="cme_empl_rt", length=4)
	private String cmeEmplRt;
	
	@Column(name="cme_empl_rw", length=4)
	private String cmeEmplRw;
	
	@Column(name="cme_empl_prov_code", length=10)
	private String cmeEmplProvCode;
	
	@Column(name="cme_empl_city_code", length=10)
	private String cmeEmplCityCode;
	
	@Column(name="cme_empl_kec_code", length=10)
	private String cmeEmplKecCode;
	
	@Column(name="cme_empl_kel_code", length=10)
	private String cmeEmplKelCode;
	
	@Column(name="cme_empl_zip_code", length=6)
	private String cmeEmplZipCode;
	
	@Column(name="cme_empl_handphone", length=20)
	private String cmeEmplHandphone;
	
	@Column(name="cme_empl_email", length=40)
	private String cmeEmplEmail;
	
	@Column(name="cme_username", length=40)
	private String cmeUsername;
	
	@Column(name="cme_password", length=40)
	private String cmePassword;
	
	@Column(name="cme_active_date")
	private Date cmeActiveDate;
	
	@Column(name="cme_resign_date")
	private Date cmeResignDate;
	
	@Column(name="cme_id_no", length=20)
	private String cmeIdNo;
	
	@Column(name="cme_job_level", nullable = false)
	private Integer cmeJobLevel;
	
	@Column(name="cme_sub_level", nullable = false)
	private Integer cmeSubLevel;
	
	@Column(name="cme_description", length=20)
	private String cmeDescription;
	
	@Column(name="cme_up_level")
	private Integer cmeUpLevel;
	
	@Column(name="cme_up_sub_level")
	private Integer cmeUpSubLevel;
	
	@Column(name="cme_pjs_empl_code", length=20)
	private String cmePjsEmplCode;
	
	@Column(name="cme_created_by", length=40)
	private String cmeCreateBy;
	
	@Column(name="cme_created_date")
	private Date cmeCreateDate;
	
	@Column(name="cme_updated_by", length=40)
	private String cmeUpdateBy;
	
	@Column(name="cme_updated_date")
	private Date cmeUpdateDate;
	
	@Column(name="cme_id_ctpic_ref_no")
	private Integer cmeIdCtpicRefNo;
	
	@Column(name="cme_id_ctpic_seq_no")
	private Integer cmeIdCtpicSeqNo;

}
