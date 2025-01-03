package com.web_admin.Models;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CoreCustomerPicCompKey implements Serializable{
	
    private BigDecimal ccpicId;
	
	private String ccpicCustNo;

}
