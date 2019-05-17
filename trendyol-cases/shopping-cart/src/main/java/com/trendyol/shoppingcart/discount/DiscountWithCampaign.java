package com.trendyol.shoppingcart.discount;

import com.trendyol.shoppingcart.base.ICategory;
import com.trendyol.shoppingcart.enums.DiscountType;
import com.trendyol.shoppingcart.base.Category;

import java.util.Collection;
import java.util.Set;

public class DiscountWithCampaign implements DiscountBehavior {
   private ICategory category;
   private double discount;
   private double numberOfProducts;
   private DiscountType discountType;

    public DiscountWithCampaign(ICategory category, double discount, double numberOfProducts, DiscountType discountType) {
        this.category = category;
        this.discount = discount;
        this.numberOfProducts = numberOfProducts;
        this.discountType=discountType;
    }

    @Override
    public boolean makeDiscount(double amount) {
        category.getALlCategory();

        return false;


    }


}
