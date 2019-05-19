package com.trendyol.shoppingcart.discount;


import com.trendyol.shoppingcart.campaign.Campaign;
import com.trendyol.shoppingcart.campaign.ICampaign;

import java.util.ArrayList;
import java.util.List;

public class DiscountFactory {

    public static List<IDiscountStrategy> getDiscountStrategy(List<ICampaign> campaigns) {

        List<IDiscountStrategy> discountStrategies = new ArrayList<>();
        for (ICampaign campaign : campaigns)
            if (campaign.getStatus()) {
                switch (campaign.getDiscountType()) {
                    case AMOUNT:
                        discountStrategies.add(new AmountIDiscount(campaign));
                        break;
                    case RATE:
                        discountStrategies.add(new RateIDiscount(campaign));
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
        return discountStrategies;
    }
}
