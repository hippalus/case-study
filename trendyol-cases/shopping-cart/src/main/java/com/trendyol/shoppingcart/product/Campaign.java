package com.trendyol.shoppingcart.product;

import com.trendyol.shoppingcart.category.ICategory;
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



    public ICategory getCategory() {
        return category;
    }

    public void setCategory(ICategory category) {
        this.category = category;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getMinNumOfProducts() {
        return minNumOfProducts;
    }

    public void setMinNumOfProducts(int minNumOfProducts) {
        this.minNumOfProducts = minNumOfProducts;
    }

    public DiscountType getDiscountType() {
        return discountType;
    }

    public void setDiscountType(DiscountType discountType) {
        this.discountType = discountType;
    }


}
