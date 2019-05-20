package com.trendyol.shoppingcart.product;

import com.trendyol.shoppingcart.category.Category;

import com.trendyol.shoppingcart.category.CategoryComponent;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ProductTest {
    private ProductComponent apple;
    private ProductComponent almonds;
    private CategoryComponent food;
    private CategoryComponent frut;

    @Before
    public void setUp() throws Exception {
        apple = new Product("Apple");
        almonds = new Product("Almonds");
        food = new Category("Foot");
        frut = new Category("Frut");
    }

    @Test
    public void getCategory() {
        Set<CategoryComponent> childCategory = new HashSet<>();
        childCategory.add(this.frut);
        this.apple.setCategory(this.frut);
        this.frut.setParentCategory(this.food);

        assertEquals(this.food, this.apple.getCategory().getParentCategory());
    }

    @Test
    public void getTitle() {
        String titleApple = apple.getTitle();
        String titleAlmonds = almonds.getTitle();
        assertEquals("Apple", titleApple);
        assertEquals("Almonds", titleAlmonds);
    }

    @Test
    public void getPrice() {
        apple.setPrice(10.5);
        assertEquals(10.5, apple.unitPrice(), 0);

    }

    @Test
    public void priceForQuantity() {
        apple.setPrice(50);
        assertEquals(300, apple.priceForQuantity(6), 0);
    }

    @Test
    public void isEnabled() {
    }
}