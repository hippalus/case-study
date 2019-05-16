package com.trendyol.shoppingcart.discountbehavior;

import com.trendyol.shoppingcart.enums.DiscountType;

public class DiscountWithCoupon implements DiscountBehavior {
    private double minimumAmount;
    private double discount;
    DiscountType discountType;

    public DiscountWithCoupon(double minimumAmount, double discount, DiscountType discountType) {
        this.minimumAmount = minimumAmount;
        this.discount = discount;
        this.discountType = discountType;
    }

    @Override
    public boolean makeDiscount(double amount) {

        return false;
    }
}
