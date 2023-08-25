package com.pe.ggr.banking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SavinAccount extends BankAccount{

	private double interestRate;
}
