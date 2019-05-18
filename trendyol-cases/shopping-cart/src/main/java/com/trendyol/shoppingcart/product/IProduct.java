package com.trendyol.shoppingcart.product;

import com.trendyol.shoppingcart.category.ICategory;

import java.io.Serializable;
import java.util.Collection;

public interface IProduct extends Serializable {

    Collection<? extends ICategory> getAllCategory();

    ICategory getCategory();

    String getTitle();

    boolean isEnabled();

    void setCategory(ICategory category);

    void setTitle(String title);

    void setPrice(double price);

    double unitPrice();

    double priceForQuantity(int quantity);


}
