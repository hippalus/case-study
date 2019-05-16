package com.trendyol.shoppingcart.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

public interface ICategory extends Serializable {

    String getTitle();

    ICategory getParentCategory();

    Set<ICategory> getChildCategories();

    Collection<? extends ICategory> getALlCategory();

    void setChildCategories(Set<ICategory> childCategories);

    void setTitle(String title);

    void setParentCategory(ICategory parentCategory);
}
