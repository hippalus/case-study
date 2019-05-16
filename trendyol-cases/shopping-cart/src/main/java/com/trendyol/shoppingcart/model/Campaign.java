package com.trendyol.shoppingcart.model;

import com.trendyol.shoppingcart.enums.DiscountType;

public class Campaign {

    private Category category;
    private double discount;
    private int minNumOfProducts;
    private DiscountType discountType;


    public Campaign(Category category, double discount, int minNumOfProducts, DiscountType discountType) {
        this.category = category;
        this.discount = discount;
        this.minNumOfProducts = minNumOfProducts;
        this.discountType = discountType;
    }


    public boolean checkDiscount(int numOfProducts) {
        if (numOfProducts >= minNumOfProducts)
            return true;
        return false;
    }
}
