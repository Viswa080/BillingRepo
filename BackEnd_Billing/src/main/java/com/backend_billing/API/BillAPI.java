package com.backend_billing.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.backend_billing.model.BillingEM;
import com.backend_billing.service.BillService;

@RestController
@RequestMapping(value = "/Bill")
public class BillAPI {

	@Autowired
	private Environment env;

	@Autowired
	private BillService bs;

	@PostMapping(value = "/addbill")
	public ResponseEntity<BillingEM> addbill(@RequestBody BillingEM bill) throws Exception {
		try {
			ResponseEntity<BillingEM> response;
			System.out.println("Triggered the service");
			BillingEM responsefromservice = bs.addbill(bill);
			response = new ResponseEntity<BillingEM>(responsefromservice, HttpStatus.OK);
			return response;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, env.getProperty(e.getMessage()), e);
		}

	}

	@GetMapping(value = "/check")
	public ResponseEntity<String> check() throws Exception {
		try {
			ResponseEntity<String> response;
			System.out.println("Triggered the service");
			String responsefromservice = "Triggered in Billing MS" + env.getProperty("server.port");
			response = new ResponseEntity<String>(responsefromservice, HttpStatus.OK);
			return response;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, env.getProperty(e.getMessage()), e);
		}

	}

}
