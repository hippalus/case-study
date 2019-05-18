package com.trendyol.shoppingcart.discount;

import com.trendyol.shoppingcart.category.ICategory;
import com.trendyol.shoppingcart.product.IProduct;

import java.util.Map;

public interface DiscountStrategy {
    double calculateDiscount(Map<ICategory, Map<IProduct, Integer>> groupedProductsByCategory);

}
