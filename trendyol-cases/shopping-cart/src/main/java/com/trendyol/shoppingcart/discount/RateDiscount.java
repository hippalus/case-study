package com.trendyol.shoppingcart.discount;

import com.trendyol.shoppingcart.category.ICategory;
import com.trendyol.shoppingcart.enums.DiscountType;
import com.trendyol.shoppingcart.product.Campaign;
import com.trendyol.shoppingcart.product.IProduct;

import java.util.Map;

public class RateDiscount implements DiscountStrategy {
    private Campaign campaign;

    public RateDiscount(Campaign campaign) {
        this.campaign = campaign;
    }

    @Override
    public double calculateDiscount(Map<ICategory, Map<IProduct, Integer>> groupedProductsByCategory) {
        double totalDiscountPrice = 0;
        /* todo java 8 stream api */
        for (Map.Entry<ICategory, Map<IProduct, Integer>> entry : groupedProductsByCategory.entrySet()) {
            if (campaign.getCategory() == entry.getKey()) {
                Map<IProduct, Integer> productsMap = entry.getValue();
                for (Map.Entry<IProduct, Integer> product : productsMap.entrySet()) {
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
