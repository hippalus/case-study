package com.trendyol.shoppingcart.campaign;

import com.trendyol.shoppingcart.category.CategoryComponent;
import com.trendyol.shoppingcart.enums.DiscountType;

/**
 *  Composite design pattern used.
 *  Because the composite can be composed at run-time, and the client code
 *  can manipulate all the elements without concern for which type it is for common operations such as campaign.
 */
public abstract class CampaignComponent {

    /**
     * @param status
     */
    public void isActive(boolean status){
        throw new UnsupportedOperationException();
    }

    /**
     * Campaign is active or not.
     * @return
     */
    public boolean getStatus(){
        throw new UnsupportedOperationException();
    }

    public CategoryComponent getCategory(){
        throw new UnsupportedOperationException();
    }

    /**
     * @param numOfProducts
     * @return
     */
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
