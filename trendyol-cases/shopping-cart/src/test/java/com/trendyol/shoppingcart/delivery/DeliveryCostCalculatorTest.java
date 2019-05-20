package com.trendyol.shoppingcart.delivery;

import com.trendyol.shoppingcart.category.Category;
import com.trendyol.shoppingcart.category.CategoryComponent;

import com.trendyol.shoppingcart.product.ProductComponent;
import com.trendyol.shoppingcart.product.Product;
import com.trendyol.shoppingcart.cart.ShoppingCart;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class DeliveryCostCalculatorTest {
    private Calculator deliveryCostCalculator;
    private ShoppingCart cart;
    private double costPerDelivery = 1.5;
    private double costPerProduct = 2;
    private double fixedCost = 2.99;
    private CategoryComponent technology;
    private CategoryComponent computer;
    private CategoryComponent hardware;
    private ProductComponent macPro;
    private ProductComponent mouse;
    private Set<CategoryComponent> childCategoriesForTechnology;


    @Before
    public void setUp() throws Exception {
        technology = new Category("Technology");
        computer = new Category("Computer");
        hardware = new Category("Hardware");
        macPro = new Product("Mac Pro", 80000d, computer);
        mouse = new Product("Gaming Mouse", 70d, hardware);
        childCategoriesForTechnology = new HashSet<>();
        childCategoriesForTechnology.add(computer);
        childCategoriesForTechnology.add(hardware);
        //todo bidirectional category hierarshi :)
        computer.setParentCategory(technology);
        hardware.setParentCategory(computer);
        cart = new ShoppingCart();
        cart.addItem(macPro, 1);
        cart.addItem(mouse, 2);
        deliveryCostCalculator = DeliveryCostCalculator.getInstance(this.costPerDelivery, this.costPerProduct, this.fixedCost);

    }

    @Test
    public void calculateFor() {
        double deliveryCost = deliveryCostCalculator.calculateFor(cart);
        assertEquals(14.99, deliveryCost, 0);

    }
}