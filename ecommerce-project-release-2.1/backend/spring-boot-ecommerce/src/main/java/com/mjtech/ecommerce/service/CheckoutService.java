package com.mjtech.ecommerce.service;

import com.mjtech.ecommerce.dto.Purchase;
import com.mjtech.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
