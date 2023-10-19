package com.mjtech.ecommerce.dto;

import com.mjtech.ecommerce.entity.Address;
import com.mjtech.ecommerce.entity.Customer;
import com.mjtech.ecommerce.entity.Order;
import com.mjtech.ecommerce.entity.OrderItem;
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
