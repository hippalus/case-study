package com.trendyol.shoppingcart.product;


import com.trendyol.shoppingcart.category.CategoryComponent;
import com.trendyol.shoppingcart.utilities.Utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class Product extends ProductComponent {

    private String title;
    private double price;
    private CategoryComponent category;

    public Product(String title) {
        this.title = title;
    }

    public Product(String title, Double price, CategoryComponent category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }


    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public void setCategory(CategoryComponent category) {
        this.category = category;
    }

    @Override
    public Collection<? extends CategoryComponent> getAllCategory() {
        Set<CategoryComponent> categories = new HashSet<>();
        categories.add(getCategory());
        return categories;
    }

    @Override
    public CategoryComponent getCategory() {
        return this.category;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setPrice(double price) {
        this.price=price;
    }


    @Override
    public double unitPrice() {
        return this.price;
    }

    @Override
    public double priceForQuantity(int quantity) {
        return this.price * quantity;
    }


    @Override
    public String toString() {
        return Utils.toZtring(this,"Product ");
    }
}
