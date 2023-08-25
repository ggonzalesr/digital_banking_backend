package com.pe.ggr.banking.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.pe.ggr.banking.enumes.AccountStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BankAccount {
	
	@Id
	private String id;
	
	private double balance;
	
	private Date createdAt;
	
	private AccountStatus status;
	
	private Customer customer;
	
	private List<AccountOperation> accountOperations;

}
