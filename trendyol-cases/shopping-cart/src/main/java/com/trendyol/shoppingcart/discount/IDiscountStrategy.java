package com.trendyol.shoppingcart.discount;

import com.trendyol.shoppingcart.category.ICategory;
import com.trendyol.shoppingcart.product.IProduct;

import java.util.Map;

/**
 * Bu interface yeni Indirim Strategylerini
 */
public interface IDiscountStrategy {
    double calculateDiscount(Map<ICategory, Map<IProduct, Integer>> groupedProductsByCategory);

}
