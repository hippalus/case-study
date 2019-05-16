package com.trendyol.shoppingcart.discountbehavior;

import com.trendyol.shoppingcart.enums.DiscountType;
import com.trendyol.shoppingcart.model.Campaign;
import com.trendyol.shoppingcart.model.Category;

import java.util.List;
import java.util.Map;

public class DiscountWithCampaign implements DiscountBehavior {
   private Category category;
   private double discount;
   private double numberOfProducts;
   DiscountType discountType;



    public DiscountWithCampaign(Category category, double discount, double numberOfProducts, DiscountType discountType) {
        this.category = category;
        this.discount = discount;
        this.numberOfProducts = numberOfProducts;
        this.discountType=discountType;
    }

    @Override
    public boolean makeDiscount(double amount) {

return false;


    }


}
