package com.trendyol.shoppingcart;

import com.trendyol.shoppingcart.campaign.CampaignComponent;
import com.trendyol.shoppingcart.category.Category;
import com.trendyol.shoppingcart.category.CategoryComponent;
import com.trendyol.shoppingcart.coupon.Coupon;
import com.trendyol.shoppingcart.coupon.CouponComponent;
import com.trendyol.shoppingcart.enums.DiscountType;
import com.trendyol.shoppingcart.campaign.Campaign;
import com.trendyol.shoppingcart.product.ProductComponent;
import com.trendyol.shoppingcart.product.Product;
import com.trendyol.shoppingcart.cart.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartApplication {
    public static void main(String[] args) {

        //Define Category
        CategoryComponent erkek=new Category("Erkek");
        CategoryComponent erkekAyakkabi=new Category("Erkek Ayakkabi Cat");
        erkekAyakkabi.setParentCategory(erkek);

        //Define Product
        ProductComponent erkekPantolon=new Product(" Pantolon",30.0,erkek);
        ProductComponent erkekKazak=new Product(" Kazak",20.0,erkek);
        ProductComponent erkekParfum=new Product(" Parfum Versace",100.0,erkek);
        ProductComponent kemalTanca46Num=new Product(" Kemal Tanca 46Num",350d,erkek);

        //Define Campaign
        CampaignComponent _20DiscountOnMoreThan3=new Campaign(erkekAyakkabi,20.0,3, DiscountType.AMOUNT);
        CampaignComponent __5DiscountOnMoreThan5=new Campaign(erkekAyakkabi,40,5,DiscountType.RATE);
        CampaignComponent __20DiscountOnMoreThan2=new Campaign(erkek,30,2,DiscountType.RATE);
        List<CampaignComponent> campaigns=new ArrayList<>();
        campaigns.add(_20DiscountOnMoreThan3);
        campaigns.add(__5DiscountOnMoreThan5);
        campaigns.add(__20DiscountOnMoreThan2);
        //_20DiscountOnMoreThan3.isActive(false);
       // __5DiscountOnMoreThan5.isActive(false);

        //Define Coupon
        CouponComponent component=new Coupon(100,40,DiscountType.AMOUNT);

        ShoppingCart cart =new ShoppingCart();
        cart.addItem(erkekPantolon,5);
        cart.addItem(erkekKazak,10);
        cart.addItem(erkekKazak,2);
        cart.addItem(erkekParfum,1);
        cart.addItem(kemalTanca46Num,1);
        cart.print();
        cart.removeItem(erkekPantolon,1);
        cart.totalAmount();
        cart.applyDiscount(campaigns);
        cart.applyCoupon(component);
        cart.getDeliveryCost();
        cart.print();

    }
}
