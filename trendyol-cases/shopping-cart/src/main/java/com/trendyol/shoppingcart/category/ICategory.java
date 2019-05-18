package com.trendyol.shoppingcart.category;

import java.io.Serializable;
import java.util.Collection;

public interface ICategory extends Serializable {


    String getTitle();

    ICategory getParentCategory();

    Collection<? extends ICategory> getAllCategory();

    void setTitle(String title);

    void setParentCategory(ICategory parentCategory);
}
