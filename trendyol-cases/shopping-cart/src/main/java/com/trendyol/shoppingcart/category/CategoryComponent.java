package com.trendyol.shoppingcart.category;

import java.util.Collection;

public abstract class CategoryComponent{


    public String getTitle(){
        throw new UnsupportedOperationException();
    }

    public CategoryComponent getParentCategory(){
        throw new UnsupportedOperationException();
    }

    public Collection<? extends CategoryComponent> getAllCategory(){
        throw new UnsupportedOperationException();
    }

    public void setTitle(String title){
        throw new UnsupportedOperationException();
    }

    public void setParentCategory(CategoryComponent parentCategory){
        throw new UnsupportedOperationException();
    }
}
