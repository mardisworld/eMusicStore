package com.emusicstore.dao;

import com.emusicstore.model.Cart;

import java.io.IOException;


/** Created by Marissa on 7/14/17. */

public interface CartDao {

    Cart getCartById (int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}
