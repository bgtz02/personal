package com.aa.digitalwallet.rest;

import com.aa.digitalwallet.entity.PurchaseRequest;
import com.aa.digitalwallet.service.DigitalWalletService;
import com.aa.digitalwallet.entity.DigitalWallet;
import com.aa.digitalwallet.entity.Flight;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
public class DigitalWalletRestController {
    
    @Autowired
    private transient DigitalWalletService digitalWalletService;

    
    @PostMapping("/purchase")
    public ResponseEntity<Flight> purchase(@RequestBody PurchaseRequest request){

        return new ResponseEntity<Flight>(digitalWalletService.purchaseFlight(request), HttpStatus.OK);
    }

    @GetMapping("/balance")
    public ResponseEntity<DigitalWallet> getBalance(@RequestParam Integer clientId){

        // need to pass client Id to checkBalance method

        return new ResponseEntity<DigitalWallet>(digitalWalletService.checkBalance(), HttpStatus.OK);
    }
}
