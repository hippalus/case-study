package com.trendyol.shoppingcart.discount.withcampaign;

import com.trendyol.shoppingcart.campaign.CampaignComponent;

import com.trendyol.shoppingcart.category.CategoryComponent;
import com.trendyol.shoppingcart.discount.withcampaign.IDiscountStrategy;
import com.trendyol.shoppingcart.product.ProductComponent;

import java.util.Map;
import java.util.Objects;

public class AmountIDiscount implements IDiscountStrategy {
    private CampaignComponent campaign;

    public AmountIDiscount(CampaignComponent campaign) {
        this.campaign = campaign;
    }

    @Override
    public double calculateDiscount(Map<CategoryComponent, Map<ProductComponent, Integer>> groupedProductsByCategory) {

        if (Objects.isNull(groupedProductsByCategory))
            throw new NullPointerException();

        double totalDiscountAmount = 0;
        boolean isParentExists = false;
        int temp = 0;
        /* todo O(n^2)  workaround*/
        for (Map.Entry<CategoryComponent, Map<ProductComponent, Integer>> entry : groupedProductsByCategory.entrySet()) {
            if ((entry.getKey().getParentCategory() != null && entry.getKey().getParentCategory().equals(campaign.getCategory()))) {
                isParentExists = true;
            }
            if (entry.getKey().getAllCategory().contains(campaign.getCategory())) {
                int totalNumOfProduct = 0;
                for (Map.Entry<ProductComponent, Integer> product : entry.getValue().entrySet()) {

                    totalNumOfProduct += product.getValue();
                    temp += totalNumOfProduct;
                    if (isParentExists) {
                        totalNumOfProduct = temp;
                    }

                }
                if (campaign.checkMinNumOfProduct(totalNumOfProduct)) {
                    //urun adeti 5 ve utun fiyati 10 toplam fiyat 5*10=50 indirim fiyati =5  toplam indirim =45
                    totalDiscountAmount = (campaign.getDiscount());
                }

            }
        }
        return totalDiscountAmount;
    }

}
