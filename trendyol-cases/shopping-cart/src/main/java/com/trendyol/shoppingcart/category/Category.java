package com.trendyol.shoppingcart.category;

import com.trendyol.shoppingcart.utilities.Utils;
import lombok.ToString;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class Category extends CategoryComponent {

    private String title;
    private CategoryComponent parentCategory;

    public Category(String title) {
        this.title = title;
    }

    public Category(String title, CategoryComponent parentCategory) {
        this.title = title;
        this.parentCategory = parentCategory;

    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public CategoryComponent getParentCategory() {
        return this.parentCategory;
    }


    @Override
    public Collection<? extends CategoryComponent> getAllCategory() {
        Set<CategoryComponent> categories = new HashSet<>();
        categories.add(getParentCategory());
        categories.add(this);
        return categories;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setParentCategory(CategoryComponent parentCategory) {
        this.parentCategory = parentCategory;
    }


    @Override
    public String toString() {
     return Utils.toZtring(this,"Category ");
    }
}
