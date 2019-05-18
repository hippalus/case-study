package com.trendyol.shoppingcart.product;


import com.trendyol.shoppingcart.category.ICategory;
import lombok.ToString;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
@ToString
public class Product implements IProduct {

    private String title;
    private double price;
    private ICategory category;

    public Product(String title) {
        this.title = title;
    }

    public Product(String title, Double price, ICategory category) {
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
    public void setCategory(ICategory category) {
        this.category = category;
    }

    @Override
    public Collection<? extends ICategory> getAllCategory() {
        Set<ICategory> categories = new HashSet<>();
        categories.add(getCategory());
        return categories;
    }

    @Override
    public ICategory getCategory() {
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
}
