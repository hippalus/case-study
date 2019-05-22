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

        double totalDiscountAmount = 0;
        boolean isParentExists = false;
        /* todo optimize O(n2)  workaround */
        for (Map.Entry<CategoryComponent, Map<ProductComponent, Integer>> entry : groupedProductsByCategory.entrySet()) {
            if ((entry.getKey().getParentCategory() != null && entry.getKey().getParentCategory().equals(campaign.getCategory()))) {
                isParentExists = true;
            }
            if (entry.getKey().getAllCategory().contains(campaign.getCategory())) {
                int numOfProduct = 0;
                double priceForQuantity = 0;
                for (Map.Entry<ProductComponent, Integer> product : entry.getValue().entrySet()) {
                    numOfProduct += product.getValue();
                    priceForQuantity += product.getKey().priceForQuantity(product.getValue());
                }
                if (campaign.checkMinNumOfProduct(numOfProduct)) {
                    if (isParentExists)
                        totalDiscountAmount += (priceForQuantity * campaign.getDiscount()) / 100d;
                    else totalDiscountAmount = (priceForQuantity * campaign.getDiscount()) / 100d;
                }

            }

        }
        return totalDiscountAmount;
    }

































/*
*    if (entry.getKey().getAllCategory().contains(campaign.getCategory())) {
                int numOfProduct=0;
                double priceForQuantity=0;
                for (Map.Entry<ProductComponent, Integer> product : entry.getValue().entrySet()) {
                    numOfProduct+= product.getValue();
                    priceForQuantity+= product.getKey().priceForQuantity(product.getValue());
                }
                if (campaign.checkMinNumOfProduct(numOfProduct)) {
                    //urun adeti 5 ve urun fiyati 20 toplam fiyat 5*20=100 indirim orani =%20 toplam toplam indirim=20
                    totalDiscountAmount = (priceForQuantity * campaign.getDiscount()) / 100d;
                }

            }*/
}
