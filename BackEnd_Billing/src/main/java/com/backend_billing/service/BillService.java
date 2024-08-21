package com.backend_billing.service;

import com.backend_billing.model.BillingEM;

public interface BillService {

	public abstract BillingEM addbill(BillingEM bill) throws Exception;

}
