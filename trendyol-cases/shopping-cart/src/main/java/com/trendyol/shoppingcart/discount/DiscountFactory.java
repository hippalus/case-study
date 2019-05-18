package com.trendyol.shoppingcart.discount;


import com.trendyol.shoppingcart.product.Campaign;

import java.util.ArrayList;
import java.util.List;

public class DiscountFactory {

    public static List<DiscountStrategy> getDiscountStrategy(List<Campaign> campaigns) {

        List<DiscountStrategy> discountStrategies = new ArrayList<>();
        for (Campaign campaign : campaigns)
            switch (campaign.getDiscountType()) {
                case AMOUNT:
                    discountStrategies.add(new AmountDiscount(campaign));
                    break;
                case RATE:
                    discountStrategies.add(new RateDiscount(campaign));
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        return discountStrategies;
    }
}
