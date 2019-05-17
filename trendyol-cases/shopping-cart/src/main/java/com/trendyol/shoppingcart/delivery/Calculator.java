package com.trendyol.shoppingcart.delivery;

import com.trendyol.shoppingcart.cart.ShoppingCart;

abstract class Calculator {
    abstract double calculateFor(ShoppingCart cart);
}
