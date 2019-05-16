package com.trendyol.shoppingcart.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Category implements ICategory {

    private String title;
    private ICategory parentCategory;
    private Set<ICategory> childCategories;

    public Category(String title) {
        this.title = title;
    }

    public Category(String title, Category parentCategory, Set<ICategory> childCategories) {
        this.title = title;
        this.parentCategory = parentCategory;
        this.childCategories = childCategories;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public ICategory getParentCategory() {
        return this.parentCategory;
    }

    @Override
    public Set<ICategory> getChildCategories() {
        return  this.childCategories;
    }

    @Override
    public Collection<? extends ICategory> getALlCategory() {
        Set<ICategory> categories=new HashSet<>();
        categories.add(getParentCategory());
        categories.addAll(getChildCategories());
        categories.add(this);
        return categories;
    }
    @Override
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public void setParentCategory(ICategory parentCategory) {
        this.parentCategory = parentCategory;
    }
    @Override
    public void setChildCategories(Set<ICategory> childCategories) {
        this.childCategories = childCategories;
    }
}
