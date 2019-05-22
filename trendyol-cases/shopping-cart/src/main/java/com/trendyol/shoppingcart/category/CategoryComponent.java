package com.trendyol.shoppingcart.category;

import java.util.Collection;

/**
 * Composite design pattern used.
 * Because the composite can be composed at run-time, and the client code
 * can manipulate all the elements without concern for which type it is for common operations such as category.
 */
public abstract class CategoryComponent{


    public String getTitle(){
        throw new UnsupportedOperationException();
    }

    public CategoryComponent getParentCategory(){
        throw new UnsupportedOperationException();
    }

    /**
     * @return A collection of category and parent categories
     */
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
