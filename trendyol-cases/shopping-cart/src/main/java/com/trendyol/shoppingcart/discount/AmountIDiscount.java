package com.trendyol.shoppingcart.discount;

import com.trendyol.shoppingcart.campaign.ICampaign;
import com.trendyol.shoppingcart.category.ICategory;
import com.trendyol.shoppingcart.campaign.Campaign;
import com.trendyol.shoppingcart.product.IProduct;

import java.util.Map;

public class AmountIDiscount implements IDiscountStrategy {
    private ICampaign campaign;

    public AmountIDiscount(ICampaign campaign) {
        this.campaign = campaign;
    }

    @Override
    public double calculateDiscount(Map<ICategory, Map<IProduct, Integer>> groupedProductsByCategory) {
        double totalDiscountPrice = 0;
        /* todo java 8 stream api */
            for (Map.Entry<ICategory, Map<IProduct, Integer>> entry : groupedProductsByCategory.entrySet()) {
                if (entry.getKey().getAllCategory().contains(campaign.getCategory())) {
                    Map<IProduct, Integer> productsMap = entry.getValue();
                    for (Map.Entry<IProduct, Integer> product : productsMap.entrySet()) {
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
