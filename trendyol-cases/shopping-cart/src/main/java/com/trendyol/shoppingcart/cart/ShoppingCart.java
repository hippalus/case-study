package com.trendyol.shoppingcart.cart;import com.trendyol.shoppingcart.model.Category;import com.trendyol.shoppingcart.model.ICategory;import com.trendyol.shoppingcart.model.IProduct;import com.trendyol.shoppingcart.model.Product;import java.util.LinkedHashMap;import java.util.List;import java.util.Map;public class ShoppingCart {    private Map<IProduct,Integer> products;    private Map<ICategory, Map<IProduct,Integer>> groupedProductsByCategory;    public ShoppingCart() {        this.products = new LinkedHashMap<>();        this.groupedProductsByCategory=new LinkedHashMap<>();    }    public void addItem(IProduct product,int quantity){        int previousQuantity=products.containsKey(product) ? products.get(product):0;        int currentQuantity=previousQuantity+quantity;        products.put(product,currentQuantity);    }}