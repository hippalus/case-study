package com.trendyol.shoppingcart.coupon;

import com.trendyol.shoppingcart.category.CategoryComponent;
import com.trendyol.shoppingcart.enums.DiscountType;

public abstract class CouponComponent {

    public void isActive(boolean status) {
        throw new UnsupportedOperationException();
    }

    public boolean getStatus() {
        throw new UnsupportedOperationException();
    }

    public CouponComponent getCoupon() {
        throw new UnsupportedOperationException();
    }

    public boolean checkDiscount(double totalAmount) {
        throw new UnsupportedOperationException();
    }

    public double getDiscount() {
        throw new UnsupportedOperationException();
    }

    public void setDiscount(double discount) {
        throw new UnsupportedOperationException();
    }

    public double getMinAmount() {
        throw new UnsupportedOperationException();
    }

    public void setMinAmount(double minAmount) {
        throw new UnsupportedOperationException();
    }

    public DiscountType getDiscountType() {
        throw new UnsupportedOperationException();
    }

    public void setDiscountType(DiscountType discountType) {
        throw new UnsupportedOperationException();
    }
}
