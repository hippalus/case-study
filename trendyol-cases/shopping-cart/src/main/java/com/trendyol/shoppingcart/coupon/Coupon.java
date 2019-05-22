package com.trendyol.shoppingcart.coupon;

import com.trendyol.shoppingcart.enums.DiscountType;
import com.trendyol.shoppingcart.utilities.Utils;


public class Coupon extends CouponComponent {
    private double minimumAmount;
    private double discount;
    private DiscountType discountType;
    private boolean isActive;

    public Coupon(double minimumAmount, double discount, DiscountType discountType) {
        this.minimumAmount = minimumAmount;
        this.discount = discount;
        this.discountType = discountType;
        this.isActive=true;
    }

    @Override
    public void isActive(boolean status) {
        this.isActive=status;
    }

    @Override
    public boolean getStatus() {
        return this.isActive;
    }

    @Override
    public CouponComponent getCoupon() {
        return this;
    }

    @Override
    public boolean checkDiscount(double totalAmount) {
        return totalAmount>this.minimumAmount;
    }

    @Override
    public double getDiscount() {
        return this.discount;
    }

    @Override
    public void setDiscount(double discount) {
        this.discount=discount;
    }

    @Override
    public double getMinAmount() {
        return this.minimumAmount;
    }

    @Override
    public void setMinAmount(double minAmount) {
        this.minimumAmount=minAmount;
    }

    @Override
    public DiscountType getDiscountType() {
        return this.discountType;
    }

    @Override
    public void setDiscountType(DiscountType discountType) {
        this.discountType=discountType;
    }

    @Override
    public String toString() {
        return Utils.toZtring(this);
    }
}
