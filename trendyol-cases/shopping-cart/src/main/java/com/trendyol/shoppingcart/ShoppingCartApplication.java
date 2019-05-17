package com.trendyol.shoppingcart;

import com.trendyol.shoppingcart.base.Category;
import com.trendyol.shoppingcart.base.ICategory;
import com.trendyol.shoppingcart.base.IProduct;
import com.trendyol.shoppingcart.base.Product;
import com.trendyol.shoppingcart.cart.ShoppingCart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class ShoppingCartApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartApplication.class,args);
        ShoppingCart cart =new ShoppingCart();
        ICategory erkek=new Category("Erkek");
        ICategory kadin=new Category("Kadin");

        IProduct erkekPantolon=new Product("Erkek Pantolon",30.0,erkek);

        IProduct erkekKazak=new Product("Erkek Kazak",20.0,erkek);
        cart.addItem(erkekPantolon,2);
        cart.addItem(erkekKazak,1);
        cart.retrieveGroupedProductsByCategory();
        cart.getGroupedProductsByCategory();
        cart.getProducts();
        cart.removeItem(erkekPantolon,1);
        cart.getProducts();
        cart.totalPrice();
        cart.applyCoupon();
        cart.applyDiscount(new ArrayList<>());
        cart.retrieveGroupedProductsByCategory();
        cart.getGroupedProductsByCategory();
    }
}
