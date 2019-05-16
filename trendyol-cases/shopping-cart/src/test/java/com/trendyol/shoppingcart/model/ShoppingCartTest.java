//package com.trendyol.shoppingcart.model;
//
//
//import com.trendyol.shoppingcart.discountbehavior.DiscountBehavior;
//import com.trendyol.shoppingcart.discountbehavior.DiscountWithCampaign;
//import com.trendyol.shoppingcart.enums.DiscountType;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import java.lang.reflect.Method;
//import java.util.HashSet;
//import java.util.Set;
//
//import static org.junit.Assert.*;
//
//public class ShoppingCartTest {
//    Category food;
//    Category fruit;
//    Product apple;
//    ShoppingCart cart;
//    DiscountBehavior discountBehavior;
//    private Set<Category> childCategories;
//
//
//    @Before
//    public void setUp() throws Exception {
//
//        food = new Category("food");
//        fruit = new Category("fruit");
//        childCategories = new HashSet<>();
//        childCategories.add(fruit);
//        //food.setChildCategories(childCategories);
//        apple = new Product("elma", 4.5, food);
//        cart = new ShoppingCart();
//        cart.addItems(apple, new Integer(3));
//    }
//
//    @Test
//    public void print() {
//        cart.print();
//        assertTrue("test", 1 == 1);
//    }
//
//    @Test
//    public void groupByCategoryAndPrintDetails() {
//        cart.groupByCategoryAndPrintDetails();
//        assertTrue("test", 1 == 1);
//    }
//
//    @Test
//    public void applyDiscount() {
//        cart.setDiscountBehavior(new DiscountWithCampaign(food, 20.0, cart.getQuantities().get("elma"), DiscountType.RATE));
//        cart.applyDiscount();
//        assertTrue("apply discount", true);
//    }
//
//    @Test
//    public void addItems() {
//        cart.addItems(apple,10);
//        assertEquals(new Integer(13),cart.getQuantities().get("elma"));
//    }
//
//    @org.junit.Test
//    public void getTotalPrice() {
//    }
//
//    @org.junit.Test
//    public void minusPrice() {
//    }
//}
