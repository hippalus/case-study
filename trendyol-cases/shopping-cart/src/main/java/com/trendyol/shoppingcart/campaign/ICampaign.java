package com.trendyol.shoppingcart.campaign;

import com.trendyol.shoppingcart.category.ICategory;
import com.trendyol.shoppingcart.enums.DiscountType;

public interface ICampaign {
    void isActive(boolean status);
    boolean getStatus();

    ICategory getCategory();

    boolean checkDiscount(int numOfProducts);

    void setCategory(ICategory category);

    double getDiscount();

    void setDiscount(double discount);

    int getMinNumOfProducts();

    void setMinNumOfProducts(int minNumOfProducts);

    DiscountType getDiscountType();

    void setDiscountType(DiscountType discountType);
}
