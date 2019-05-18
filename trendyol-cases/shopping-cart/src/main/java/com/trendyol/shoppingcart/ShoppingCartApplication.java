package com.trendyol.shoppingcart;

import com.trendyol.shoppingcart.category.Category;
import com.trendyol.shoppingcart.category.ICategory;
import com.trendyol.shoppingcart.enums.DiscountType;
import com.trendyol.shoppingcart.product.Campaign;
import com.trendyol.shoppingcart.product.IProduct;
import com.trendyol.shoppingcart.product.Product;
import com.trendyol.shoppingcart.cart.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
public class ShoppingCartApplication {
    public static void main(String[] args) {
      //  SpringApplication.run(ShoppingCartApplication.class,args);
        ShoppingCart cart =new ShoppingCart();
        ICategory erkek=new Category("Erkek");
        ICategory kadin=new Category("Kadin");

        IProduct erkekPantolon=new Product("Erkek Pantolon",30.0,erkek);

        IProduct erkekKazak=new Product("Erkek Kazak",20.0,erkek);


        Campaign  _20DiscountOnMoreThan3=new Campaign(erkek,20.0,3, DiscountType.AMOUNT);
        Campaign __5DiscountOnMoreThan5=new Campaign(kadin,5,5,DiscountType.RATE);
       List<Campaign> campaigns=new ArrayList<>();
        campaigns.add(_20DiscountOnMoreThan3);
        campaigns.add(__5DiscountOnMoreThan5);
        cart.addItem(erkekPantolon,5);
        cart.addItem(erkekKazak,10);
        cart.retrieveGroupedProductsByCategory();
        cart.getGroupedProductsByCategory();
        cart.getProducts();
        cart.removeItem(erkekPantolon,1);
        cart.getProducts();
        cart.totalPrice();
        cart.applyCoupon();
        cart.applyDiscount(campaigns);
        cart.retrieveGroupedProductsByCategory();
        cart.getGroupedProductsByCategory();
        cart.deliveryCost();
        cart.print();
    }
}
