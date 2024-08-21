package com.backend_billing.dao;

import java.time.LocalDate;
import org.springframework.stereotype.Repository;
import com.backend_billing.model.BillingEM;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository(value = "billingdao")
public class BillDAOIMPL implements BillDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public BillingEM addbill(BillingEM bill) {
		bill.setBillno(bill.getBillno());
		bill.setBilldate(LocalDate.now());
		// System.out.println("Done till copy");
		em.persist(bill);
		// System.out.println("Done in DAO");
		return bill;
	}

}
