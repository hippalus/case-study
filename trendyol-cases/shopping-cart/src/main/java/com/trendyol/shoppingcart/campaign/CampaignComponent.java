package com.trendyol.shoppingcart.campaign;

import com.trendyol.shoppingcart.category.CategoryComponent;
import com.trendyol.shoppingcart.enums.DiscountType;

public abstract class CampaignComponent {
    public void isActive(boolean status){
        throw new UnsupportedOperationException();
    }
    public boolean getStatus(){
        throw new UnsupportedOperationException();
    }

    public CategoryComponent getCategory(){
        throw new UnsupportedOperationException();
    }

    public boolean checkDiscount(int numOfProducts){
        throw new UnsupportedOperationException();
    }

    public void setCategory(CategoryComponent category){
        throw new UnsupportedOperationException();
    }

    public double getDiscount(){
        throw new UnsupportedOperationException();
    }

    public void setDiscount(double discount){
        throw new UnsupportedOperationException();
    }

    public int getMinNumOfProducts(){
        throw new UnsupportedOperationException();
    }

    public void setMinNumOfProducts(int minNumOfProducts){
        throw new UnsupportedOperationException();
    }

    public DiscountType getDiscountType(){
        throw new UnsupportedOperationException();
    }

    public void setDiscountType(DiscountType discountType){
        throw new UnsupportedOperationException();
    }
}
