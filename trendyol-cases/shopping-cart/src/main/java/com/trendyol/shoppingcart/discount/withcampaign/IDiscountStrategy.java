package com.trendyol.shoppingcart.discount.withcampaign;

import com.trendyol.shoppingcart.category.CategoryComponent;
import com.trendyol.shoppingcart.product.ProductComponent;

import java.util.Map;


/**
 * Strategy design pattern used.
 * Because calculations will vary according to the types of discounts.
 * This interface can be applied to implement a new discount calculation
 */
public interface IDiscountStrategy {
    double calculateDiscount(Map<CategoryComponent, Map<ProductComponent, Integer>> groupedProductsByCategory);


}
