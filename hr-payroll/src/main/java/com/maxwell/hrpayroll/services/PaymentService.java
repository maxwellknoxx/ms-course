package com.maxwell.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.maxwell.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, Integer days) {
		return new Payment("Bob", 200.0, days);
	}

}
