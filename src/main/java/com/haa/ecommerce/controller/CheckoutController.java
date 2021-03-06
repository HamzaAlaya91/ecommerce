package com.haa.ecommerce.controller;

import com.haa.ecommerce.dto.Purchase;
import com.haa.ecommerce.dto.PurchaseResponse;
import com.haa.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("https://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
        System.out.println("----------****--------Go API Purchase----------****--------");
        System.out.println(purchase);
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}









