package com.trendyol.shoppingcart.base;

import com.trendyol.shoppingcart.enums.DiscountType;

public class Campaign {

    private ICategory category;
    private double discount;
    private int minNumOfProducts;
    private DiscountType discountType;


    public Campaign(ICategory category, double discount, int minNumOfProducts, DiscountType discountType) {
        this.category = category;
        this.discount = discount;
        this.minNumOfProducts = minNumOfProducts;
        this.discountType = discountType;
    }


    public boolean checkDiscount(int numOfProducts) {
        return numOfProducts > minNumOfProducts;
    }
}
