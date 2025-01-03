package com.web_admin.Models;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CoreCustomerBankCompKey implements Serializable{
	
    private BigDecimal ccbaId;
	
	private String ccbaCustNo;

}
