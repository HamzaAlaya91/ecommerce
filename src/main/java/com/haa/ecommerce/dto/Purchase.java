package com.haa.ecommerce.dto;

import com.haa.ecommerce.entity.Address;
import com.haa.ecommerce.entity.Customer;
import com.haa.ecommerce.entity.Order;
import com.haa.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
