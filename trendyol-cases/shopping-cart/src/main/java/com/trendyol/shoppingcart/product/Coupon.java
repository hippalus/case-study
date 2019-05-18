package com.trendyol.shoppingcart.product;

import com.trendyol.shoppingcart.enums.DiscountType;

public class Coupon {
    private double minimumAmount;
    private double discount;
    DiscountType discountType;

    public Coupon(double minimumAmount, double discount, DiscountType discountType) {
        this.minimumAmount = minimumAmount;
        this.discount = discount;
        this.discountType = discountType;
    }


    public boolean makeDiscount(double amount) {
        return amount >= this.minimumAmount;
    }
}
