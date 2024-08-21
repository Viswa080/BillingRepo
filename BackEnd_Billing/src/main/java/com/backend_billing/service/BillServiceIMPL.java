package com.backend_billing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend_billing.dao.BillDAO;
import com.backend_billing.model.BillingEM;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BillServiceIMPL implements BillService {

	@Autowired
	private BillDAO dao;

	@Override
	public BillingEM addbill(BillingEM bill) throws Exception {
		try {
			return dao.addbill(bill);
		} catch (Exception e) {
			throw new Exception("SOMETHING_WENT_WRONG");
		}

	}

}
