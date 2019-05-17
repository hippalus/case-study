package com.trendyol.shoppingcart.cart;
import com.trendyol.shoppingcart.base.IProduct;
import java.util.Map;

/**
 *
 */
public class CartResponse {
    private double totalAmountAfterDiscount;
    private double couponDiscount;
    private String categoryName;
    private String productName;
    private Map<IProduct,Integer> quantity;
    private Map<IProduct,Double> unitPrice;
    private double totalPrice;
    private double totalDiscountWithCampaign;
    private double totalDiscountWithCoupon;
    private double totalAmount;
    private double deliveryCost;
}