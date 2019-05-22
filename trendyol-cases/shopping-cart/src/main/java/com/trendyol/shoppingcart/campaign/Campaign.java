package com.trendyol.shoppingcart.campaign;

import com.trendyol.shoppingcart.category.CategoryComponent;
import com.trendyol.shoppingcart.enums.DiscountType;


public class Campaign extends CampaignComponent {

    private CategoryComponent category;
    private double discount;
    private int minNumOfProducts;
    private DiscountType discountType;
    private boolean isActive;


    public Campaign(CategoryComponent category, double discount, int minNumOfProducts, DiscountType discountType) {
        this.category = category;
        this.discount = discount;
        this.minNumOfProducts = minNumOfProducts;
        this.discountType = discountType;
        this.isActive = true;
    }


    @Override
    public boolean checkMinNumOfProduct(int numOfProducts) {
       return numOfProducts >this.minNumOfProducts;
    }

    @Override
    public boolean checkDiscount(double totalAmount) {
          return totalAmount>this.discount;
    }

    @Override
    public CategoryComponent getCategory() {
        return this.category;
    }

    @Override
    public void setCategory(CategoryComponent category) {
        this.category = category;
    }

    @Override
    public double getDiscount() {
        return this.discount;
    }

    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public int getMinNumOfProducts() {
        return this.minNumOfProducts;
    }

    @Override
    public void setMinNumOfProducts(int minNumOfProducts) {
        this.minNumOfProducts = minNumOfProducts;
    }

    @Override
    public DiscountType getDiscountType() {
        return this.discountType;
    }

    @Override
    public void setDiscountType(DiscountType discountType) {
        this.discount = discount;
    }

    @Override
    public boolean getStatus() {
        return this.isActive;
    }

    @Override
    public void isActive(boolean status) {
        this.isActive = status;
    }


}
