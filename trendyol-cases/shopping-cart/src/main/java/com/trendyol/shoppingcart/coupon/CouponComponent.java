package com.trendyol.shoppingcart.coupon;

import com.trendyol.shoppingcart.enums.DiscountType;

/**
 * Composite design pattern used.
 * Because the composite can be composed at run-time, and the client code
 * can manipulate all the elements without concern for which type it is for common operations such as category.
 */
public abstract class CouponComponent {

    /**
     * Change Coupon status
     *
     * @param status
     */
    public void isActive(boolean status) {
        throw new UnsupportedOperationException();
    }

    /**
     * Campaign is active or not.
     *
     * @return
     */
    public boolean getStatus() {
        throw new UnsupportedOperationException();
    }

    /**
     * @param totalAmount
     * @return If the total amount is greater than the discount, it is true .
     */
    public boolean checkDiscount(double totalAmount) {
        throw new UnsupportedOperationException();
    }

    public CouponComponent getCoupon() {
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
