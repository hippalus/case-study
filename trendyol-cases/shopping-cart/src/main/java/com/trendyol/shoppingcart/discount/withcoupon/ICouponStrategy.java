package com.trendyol.shoppingcart.discount.withcoupon;


/**
 * Strategy design pattern used.
 * Because calculations will vary according to the types of discounts.
 * This interface can be applied to implement a new discount calculation
 */
public interface ICouponStrategy {

    double calculateCouponDiscount(double totalAmount);
}
