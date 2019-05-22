package com.trendyol.shoppingcart.product;

import com.trendyol.shoppingcart.category.CategoryComponent;
import java.util.Collection;

/**
 * Composite design pattern used.
 * Because the composite can be composed at run-time, and the client code
 * can manipulate all the elements without concern for which type it is for common operations such as Product.
 */
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

    public void isEnabled(boolean status){
        throw new  UnsupportedOperationException();
    }
    public boolean getStatus(){throw  new UnsupportedOperationException();}

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


    /**
     * @param quantity
     * @return (quantity*unit price)
     */
    public double priceForQuantity(int quantity){
        throw new  UnsupportedOperationException();
    }


}
