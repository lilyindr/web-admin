package com.web_admin.Models;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CoreCustomerAddressCompKey implements Serializable{
	
	private BigDecimal ccaddrId;
	
	private String ccaddrCustNo;

}
