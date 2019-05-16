package com.trendyol.shoppingcart.model;

import com.trendyol.shoppingcart.discountbehavior.DiscountBehavior;

import java.util.*;
import java.util.stream.Collectors;


public class ShoppingCart {
    private List<Product> products;
    private Map<Category,List<Product>> groupedProducts;
    private  double totalPrice;
    private  double totalDiscount;
    private  double totalAmount;
    private  double totalAmountAfterDiscount;

    private double couponDiscount;
    private double campaignDiscount;
    private double deliveryCost;
    private Map<String,Integer> quantities;


    public ShoppingCart() {
        this.products = new ArrayList<>();
        this.quantities = new HashMap<>();
    }


    public void applyDiscount(List<Double> discounts){
//        for (M:
//             groupedProducts) {
//
//        }
//


    }
    public void applyCoupon(List<Coupon> coupons){


    }
    public void print(){
        System.out.println("Total Amount for this cart: "+ this.totalAmount +"\n" + "Delivery Cost for this cart: "+ this.deliveryCost);


    }

  /*  protected void groupByCategoryAndPrintDetails(){
        System.out.println("fed");
    // groupedProducts=this.products.stream().collect(Collectors.groupingBy(p->p.getCategory()));
        groupedProducts.forEach((category, products1) -> {
            System.out.println(category.getTitle());
            double totalPriceGroupBy = 0;
            for (Product product:products1) {
                System.out.println("Product name: "+product.getTitle());
                System.out.println("Product Quantity: "+ quantities.get(product));
                System.out.println("Product unit price :" +product.getPrice());
                totalPriceGroupBy+= product.getPrice();


            }
            System.out.println("Total Price Group By Category:"+totalPriceGroupBy);
            System.out.println("Total Discount:"+this.totalDiscount);
        });




    }
*/

     /*void addItems(Product product,Integer quantity){


        this.products.add(product);
        if(this.quantities.containsKey(product.getTitle())){
            quantity+=this.quantities.get(product.getTitle());
            this.quantities.replace(product.getTitle(),quantity);


        }
        else{
            this.quantities.put(product.getTitle(),quantity);

        }

        this.totalPrice+=product.getPrice();



    }
*/
    double getTotalPrice(){
        return this.totalPrice;
    }
    double minusPrice(Product product){
        return 0;
    }




    public Map<String, Integer> getQuantities() {
        return quantities;
    }

    public void setQuantities(Map<String, Integer> quantities) {
        this.quantities = quantities;
    }
}
