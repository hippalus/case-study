package com.trendyol.shoppingcart.delivery;

import com.trendyol.shoppingcart.base.Category;
import com.trendyol.shoppingcart.base.ICategory;
import com.trendyol.shoppingcart.base.IProduct;
import com.trendyol.shoppingcart.base.Product;
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
    private ICategory  technology;
    private   ICategory  computer;
    private  ICategory  hardware;
    private  IProduct macPro;
    private IProduct mouse;
    private  Set<ICategory> childCategoriesForTechnology;





    @Before
    public void setUp() throws Exception {
        technology=new Category("Technology");
        computer=new Category("Computer");
        hardware=new Category("Hardware");
        macPro=new Product("Mac Pro" ,80000d,computer);
        mouse=new Product("Gaming Mouse" ,70d,hardware);
        childCategoriesForTechnology=new HashSet<>();
        childCategoriesForTechnology.add(computer);
        childCategoriesForTechnology.add(hardware);
        //todo bidirectional category hierarshi :)
        technology.setChildCategories(childCategoriesForTechnology);
        computer.setParentCategory(technology);
        hardware.setParentCategory(computer);
        cart=new ShoppingCart();
        cart.addItem(macPro,1);
        cart.addItem(mouse,2);
        deliveryCostCalculator = DeliveryCostCalculator.getInstance(this.costPerDelivery, this.costPerProduct, this.fixedCost);

    }

    @Test
    public void calculateFor() {
        double deliveryCost=deliveryCostCalculator.calculateFor(cart);
        assertEquals(14.99,deliveryCost,0);

    }
}