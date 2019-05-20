package com.trendyol.shoppingcart.discount.withcoupon;

import com.trendyol.shoppingcart.coupon.CouponComponent;
import com.trendyol.shoppingcart.enums.DiscountType;

public class ApplyCouponFactory {

    public static ICouponStrategy getApplyCoupon(CouponComponent coupon) {

        if (coupon.getStatus()) {
            if (coupon.getDiscountType() == DiscountType.RATE) {
                return new RateCoupon(coupon);
            } else if (coupon.getDiscountType() == DiscountType.AMOUNT) {
                return new AmountCoupon(coupon);
            }
            else throw new IllegalArgumentException();

        }

        return null;
    }

}
