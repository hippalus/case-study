package com.trendyol.shoppingcart.discount.withcampaign;

import com.trendyol.shoppingcart.campaign.CampaignComponent;

import com.trendyol.shoppingcart.category.CategoryComponent;
import com.trendyol.shoppingcart.product.ProductComponent;

import java.util.Map;
import java.util.Objects;

public class RateIDiscount implements IDiscountStrategy {
    private CampaignComponent campaign;

    public RateIDiscount(CampaignComponent campaign) {
        this.campaign = campaign;
    }

    @Override
    public double calculateDiscount(Map<CategoryComponent, Map<ProductComponent, Integer>> groupedProductsByCategory) {

        if (Objects.isNull(groupedProductsByCategory))
            throw new NullPointerException();

        double totalDiscountPrice = 0;
        /* todo java 8 stream api */
        for (Map.Entry<CategoryComponent, Map<ProductComponent, Integer>> entry : groupedProductsByCategory.entrySet()) {
            //Eger kampanyanin uyguladigi kategoriye ait sub categoriyide iceriyorsa
            if (entry.getKey().getAllCategory().contains(campaign.getCategory())) {
                for (Map.Entry<ProductComponent, Integer> product :  entry.getValue().entrySet()) {
                    if (campaign.checkDiscount(product.getValue())) {
                        //urun adeti 5 ve urun fiyati 20 toplam fiyat 5*20=100 indirim orani =%20 toplam toplam indirim=20
                        totalDiscountPrice += (product.getKey().priceForQuantity(product.getValue()) * campaign.getDiscount()) / 100d;
                    }
                }
            }
        }
        return totalDiscountPrice;
    }


}
