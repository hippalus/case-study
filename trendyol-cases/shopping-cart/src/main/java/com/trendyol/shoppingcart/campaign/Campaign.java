package com.trendyol.shoppingcart.campaign;

import com.trendyol.shoppingcart.category.CategoryComponent;
import com.trendyol.shoppingcart.enums.DiscountType;

import java.util.Objects;

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
        this.isActive=true;
    }
    public boolean checkDiscount(int numOfProducts) {
        return numOfProducts > minNumOfProducts;
    }


    @Override
    public CategoryComponent getCategory() {
        return this.category;
    }

    @Override
    public void setCategory(CategoryComponent category) {
        this.category=category;
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
    public int getMinNumOfProducts() {
        return this.minNumOfProducts;
    }

    @Override
    public void setMinNumOfProducts(int minNumOfProducts) {
        this.minNumOfProducts=minNumOfProducts;
    }

    @Override
    public DiscountType getDiscountType() {
        return this.discountType;
    }

    @Override
    public void setDiscountType(DiscountType discountType) {
        this.discount=discount;
    }

    @Override
    public boolean getStatus() {
        return this.isActive;
    }

    @Override
    public void isActive(boolean status) {
        this.isActive=status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Campaign)) return false;
        Campaign campaign = (Campaign) o;
        return Double.compare(campaign.getDiscount(), getDiscount()) == 0 &&
                getMinNumOfProducts() == campaign.getMinNumOfProducts() &&
                Objects.equals(getCategory(), campaign.getCategory()) &&
                getDiscountType() == campaign.getDiscountType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCategory(), getDiscount(), getMinNumOfProducts(), getDiscountType());
    }


}
