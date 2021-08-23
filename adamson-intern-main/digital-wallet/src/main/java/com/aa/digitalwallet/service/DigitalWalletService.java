package com.aa.digitalwallet.service;

import com.aa.digitalwallet.entity.PurchaseRequest;
import com.aa.digitalwallet.entity.DigitalWallet;
import com.aa.digitalwallet.entity.Flight;

public interface DigitalWalletService {

    public Flight purchaseFlight(PurchaseRequest request);

    public DigitalWallet checkBalance();

}