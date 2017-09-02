package com.emusicstore.service;

import com.emusicstore.model.Cart;


/** Created by Marissa on 7/14/17. */

public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
