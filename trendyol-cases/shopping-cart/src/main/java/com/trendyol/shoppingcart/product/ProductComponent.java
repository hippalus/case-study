package com.trendyol.shoppingcart.product;

import com.trendyol.shoppingcart.category.CategoryComponent;
import java.util.Collection;

public abstract class ProductComponent {

   public Collection<? extends CategoryComponent> getAllCategory(){
        throw new  UnsupportedOperationException();
    }

    public CategoryComponent getCategory(){
        throw new  UnsupportedOperationException();
    }

    public String getTitle(){
        throw new  UnsupportedOperationException();
    }

    public boolean isEnabled(){
        throw new  UnsupportedOperationException();
    }

    public void setCategory(CategoryComponent category){
        throw new  UnsupportedOperationException();
    }

    public void setTitle(String title){
        throw new  UnsupportedOperationException();
    }

    public void setPrice(double price){
        throw new  UnsupportedOperationException();
    }

    public double unitPrice(){
        throw new  UnsupportedOperationException();
    }

    public double priceForQuantity(int quantity){
        throw new  UnsupportedOperationException();
    }


}
