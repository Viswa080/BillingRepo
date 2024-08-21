package com.backend_billing.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "billtable")
public class BillingEM {
	@Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY) //giving error during
	// persist, if it is enabled
	private int Billno;
	private LocalDate Billdate;
	private String Customername;
	private int Billmarkedamount;
	private int Billpaidamount;

}
