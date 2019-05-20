package com.trendyol.shoppingcart.discount.withcampaign;

import com.trendyol.shoppingcart.campaign.CampaignComponent;

import com.trendyol.shoppingcart.category.CategoryComponent;
import com.trendyol.shoppingcart.discount.withcampaign.IDiscountStrategy;
import com.trendyol.shoppingcart.product.ProductComponent;

import java.util.Map;

public class AmountIDiscount implements IDiscountStrategy {
    private CampaignComponent campaign;

    public AmountIDiscount(CampaignComponent campaign) {
        this.campaign = campaign;
    }

    @Override
    public double calculateDiscount(Map<CategoryComponent, Map<ProductComponent, Integer>> groupedProductsByCategory) {
        double totalDiscountPrice = 0;
        /* todo java 8 stream api */
            for (Map.Entry<CategoryComponent, Map<ProductComponent, Integer>> entry : groupedProductsByCategory.entrySet()) {
                if (entry.getKey().getAllCategory().contains(campaign.getCategory())) {
                    Map<ProductComponent, Integer> productsMap = entry.getValue();
                    for (Map.Entry<ProductComponent, Integer> product : productsMap.entrySet()) {
                        if (campaign.checkDiscount(product.getValue())) {
                            //urun adeti 5 ve utun fiyati 10 toplam fiyat 5*10=50 indirim fiyati =5  toplam indirim =45
                            totalDiscountPrice += (product.getKey().priceForQuantity(product.getValue()) - campaign.getDiscount());
                        }
                    }
                }
            }
        return totalDiscountPrice;
    }

}
