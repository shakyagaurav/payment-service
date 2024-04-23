package com.demo.resource;

import com.demo.entity.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentResource {

    @PostMapping("/create")
    public ResponseEntity<Payment> createPayment() {
        return new ResponseEntity<>(new Payment(1L, "CARD", 299d, "IN-PROCESS"), HttpStatus.OK);
    }

}
