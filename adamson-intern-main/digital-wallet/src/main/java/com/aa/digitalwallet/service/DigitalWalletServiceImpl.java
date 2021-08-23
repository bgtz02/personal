package com.aa.digitalwallet.service;

import com.aa.digitalwallet.service.DigitalWalletService;
import com.aa.digitalwallet.entity.PurchaseRequest;
import com.aa.digitalwallet.entity.Flight;
import com.aa.digitalwallet.entity.DigitalWallet;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class DigitalWalletServiceImpl implements DigitalWalletService {
    private final Flight DFW = new Flight("DFW", "1997", "4A", true, LocalDateTime.now(), LocalDateTime.now().plusDays(2).plusHours(1), 100);
    private final Flight ORD = new Flight("ORD", "1998", "4B", true, LocalDateTime.now(), LocalDateTime.now().plusDays(2).plusHours(2), 110);
    private final Flight MIA = new Flight("MIA", "1999", "4C", true, LocalDateTime.now(), LocalDateTime.now().plusDays(2).plusHours(3), 130); 

    public Flight purchaseFlight(PurchaseRequest request) {

        // Stores the flight number of the AA flight
        String dfwFlightNum = DFW.getFlightNumber();

        // Take the request made and use it to deduct the flight price from the wallet balance

        if (dfwFlightNum.equalsIgnoreCase(request.getFlightNumber())) {
            // get the price of the flight

            // subtract from overall wallet amount of the person who requested the purchase

        }

        // if the flight number doesn't match the above case, then check the other two flight numbers
        
        /**
         * if matches as, get as flight price, then deduct from wallet
         * 
         * if matches jb, get jb flight price, then deduct from wallet
         * 
         */

        // return whatever flight they bought
        return DFW; // Placeholder of AA for now, but can be any other flight.
    }

    // Need to pass in the client information in this parameter
    public DigitalWallet checkBalance() {
        // check the total balance left for a specific user
        
        // Need to return the wallet for whoever requested their balance
        return new DigitalWallet(1000, 1);
    }
}
