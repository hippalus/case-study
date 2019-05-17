package com.trendyol.shoppingcart.cart;
import com.trendyol.shoppingcart.base.ICategory;
import com.trendyol.shoppingcart.base.IProduct;
import com.trendyol.shoppingcart.discount.DiscountBehavior;
import java.util.*;
import java.util.stream.Collectors;

public class ShoppingCart {
    private Map<IProduct, Integer> products;
    private Map<ICategory, Map<IProduct,Integer>> groupedProductsByCategory;


    public ShoppingCart() {
        //to keep the products in the same order they were inserted
        this.products = new LinkedHashMap<>();
        this.groupedProductsByCategory = new LinkedHashMap<>();
    }

    /**
     * @param product
     * @param quantity
     */
    public void addItem(IProduct product, int quantity) {
        int previousQuantity = this.products.containsKey(product) ? this.products.get(product) : 0;
        int currentQuantity = previousQuantity + quantity;
        this.products.put(product, currentQuantity);
        retrieveGroupedProductsByCategory();
        totalPrice();
    }

    /**
     * @param product
     * @param quantity
     */
    public void removeItem(IProduct product,int quantity){
       int previousQuantity= this.products.containsKey(product)?this.products.get(product):0;
       int currentQuantity=previousQuantity-quantity;
       if(currentQuantity==0){
           this.products.remove(product);
       }else{
           this.products.replace(product,currentQuantity);
       }
        retrieveGroupedProductsByCategory();
        totalPrice();
    }

    /**
     *
     */
    public void  retrieveGroupedProductsByCategory(){
        for (Map.Entry<IProduct,Integer> entry:products.entrySet() ) {
            if(!this.groupedProductsByCategory.containsKey(entry.getKey().getCategory())) {
                Map<IProduct,Integer>  map=new LinkedHashMap<>();
                map.put(entry.getKey(),entry.getValue());
                this.groupedProductsByCategory.put(entry.getKey().getCategory(),map);
            }else{
                this.groupedProductsByCategory.get(entry.getKey().getCategory()).put(entry.getKey(),entry.getValue());
            }
        }
    }
    public int getNumberOfProduct(){
        int numOfProduct = this.products.values().stream().mapToInt(i->i).sum();
        return numOfProduct;
    }
    public int getNumberOfDifferentProduct(){
        int numOfDifferentProduct = this.products.keySet().size();
        return numOfDifferentProduct;
    }
    public int getNumberOfDifferentCategory(){
        int numOfDifferentCategory = this.groupedProductsByCategory.keySet().size();
        return numOfDifferentCategory;
    }


    /**
     * @return totalPrice
     */
    public double totalPrice() {
        double totalPrice = 0;
        for (IProduct items : this.products.keySet()) {
            totalPrice += items.priceForQuantity(this.products.get(items));
        }
        return totalPrice;
    }

    public void applyDiscount(List<Double> discount) {


    }

    public void applyCoupon() {
    }

    /**
     * @return
     */
    public boolean isEmpty() {
        return getProducts().isEmpty();
    }


    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                ", groupedProductsByCategory=" + groupedProductsByCategory +
                '}';
    }

    public Map<IProduct, Integer> getProducts() {
        return this.products;

    }

    public Map<ICategory, Map<IProduct,Integer>> getGroupedProductsByCategory() {
        return this.groupedProductsByCategory;
    }
}
