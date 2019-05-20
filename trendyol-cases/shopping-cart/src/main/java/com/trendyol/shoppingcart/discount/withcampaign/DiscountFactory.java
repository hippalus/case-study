package com.trendyol.shoppingcart.discount.withcampaign;


import com.trendyol.shoppingcart.campaign.CampaignComponent;


import java.util.ArrayList;
import java.util.List;

public class DiscountFactory {

    public static List<IDiscountStrategy> getDiscountStrategy(List<CampaignComponent> campaigns) {

        List<IDiscountStrategy> discountStrategies = new ArrayList<>();
        for (CampaignComponent campaign : campaigns)
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
