package com.trendyol.shoppingcart.discount.withcampaign;

import com.trendyol.shoppingcart.category.CategoryComponent;
import com.trendyol.shoppingcart.product.ProductComponent;

import java.util.Map;

/**
 * Bu interface yeni Indirim Strategylerini
 */
public interface IDiscountStrategy {
    double calculateDiscount(Map<CategoryComponent, Map<ProductComponent, Integer>> groupedProductsByCategory);

}
