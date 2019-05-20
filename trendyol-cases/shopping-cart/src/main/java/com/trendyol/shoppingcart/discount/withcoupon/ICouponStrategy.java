package com.trendyol.shoppingcart.discount.withcoupon;

import com.trendyol.shoppingcart.cart.ShoppingCart;
import com.trendyol.shoppingcart.category.CategoryComponent;
import com.trendyol.shoppingcart.coupon.CouponComponent;
import com.trendyol.shoppingcart.product.ProductComponent;

import java.util.Map;

public interface ICouponStrategy {

    double calculateCouponDiscount(double totalAmount);
}
