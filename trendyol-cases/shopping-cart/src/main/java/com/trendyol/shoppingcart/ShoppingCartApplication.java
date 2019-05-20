package com.trendyol.shoppingcart;

import com.trendyol.shoppingcart.campaign.ICampaign;
import com.trendyol.shoppingcart.category.Category;
import com.trendyol.shoppingcart.category.ICategory;
import com.trendyol.shoppingcart.enums.DiscountType;
import com.trendyol.shoppingcart.campaign.Campaign;
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
        ICategory erkekAyakkabi=new Category("Erkek Ayakkabi Cat");
        erkekAyakkabi.setParentCategory(erkek);


        IProduct erkekPantolon=new Product("Erkek Pantolon",30.0,erkekAyakkabi);

        IProduct erkekKazak=new Product("Erkek Kazak",20.0,erkekAyakkabi);
        IProduct erkekParfum=new Product("Erkek Parfum Versace",100.0,erkekAyakkabi);
        IProduct kemalTanca46Num=new Product("kemal Tanca 46Num",350d,erkekAyakkabi);




        ICampaign _20DiscountOnMoreThan3=new Campaign(erkek,20.0,3, DiscountType.AMOUNT);
        ICampaign __5DiscountOnMoreThan5=new Campaign(erkek,40,5,DiscountType.RATE);
       List<ICampaign> campaigns=new ArrayList<>();
        campaigns.add(_20DiscountOnMoreThan3);
        campaigns.add(__5DiscountOnMoreThan5);
        cart.addItem(erkekPantolon,5);
        cart.addItem(erkekKazak,10);
        cart.addItem(erkekKazak,2);
        cart.addItem(erkekParfum,1);
        cart.addItem(kemalTanca46Num,1);
        cart.retrieveGroupedProductsByCategory();
        cart.getGroupedProductsByCategory();
        cart.getProducts();
        cart.removeItem(erkekPantolon,1);
        cart.getProducts();
        cart.totalPrice();
        cart.applyCoupon();
        cart.applyDiscount(campaigns);
        _20DiscountOnMoreThan3.isActive(true);
        __5DiscountOnMoreThan5.isActive(true);
        cart.retrieveGroupedProductsByCategory();
        cart.getGroupedProductsByCategory();
        cart.deliveryCost();
        cart.applyDiscount(campaigns);
        cart.getGroupedProductsByCategory();
        cart.deliveryCost();
        cart.print();

    }
}
