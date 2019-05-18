package com.trendyol.shoppingcart.discount;

import com.trendyol.shoppingcart.category.ICategory;
import com.trendyol.shoppingcart.product.Campaign;
import com.trendyol.shoppingcart.product.IProduct;

import java.util.Map;

public class AmountDiscount implements DiscountStrategy {
    private Campaign campaign;

    public AmountDiscount(Campaign campaign) {
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
                        //urun adeti 5 ve utun fiyati 10 toplam fiyat 5*10=50 indirim fiyati =5  toplam indirim =45
                        totalDiscountPrice += (product.getKey().priceForQuantity(product.getValue()) - campaign.getDiscount());
                    }
                }
            }
        }
        return totalDiscountPrice;
    }

}
