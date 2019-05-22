package com.trendyol.shoppingcart.discount.withcoupon;

import com.trendyol.shoppingcart.coupon.CouponComponent;

public class RateCoupon implements ICouponStrategy {
    private CouponComponent coupon;

    public RateCoupon(CouponComponent coupon) {
        this.coupon = coupon;
    }

    @Override
    public double calculateCouponDiscount(double totalAmount) {

        return coupon.checkDiscount(totalAmount) ? (totalAmount * coupon.getDiscount() / 100) : 0;
    }
}
