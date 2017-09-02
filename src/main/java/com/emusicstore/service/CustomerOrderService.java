package com.emusicstore.service;

import com.emusicstore.model.CustomerOrder;


/** Created by Marissa on 7/14/17. */

public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
