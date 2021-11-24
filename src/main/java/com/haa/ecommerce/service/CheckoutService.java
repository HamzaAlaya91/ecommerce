package com.haa.ecommerce.service;

import com.haa.ecommerce.dto.Purchase;
import com.haa.ecommerce.dto.PurchaseResponse;


public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
