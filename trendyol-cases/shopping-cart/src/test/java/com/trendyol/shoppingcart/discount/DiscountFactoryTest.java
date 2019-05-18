package com.trendyol.shoppingcart.discount;

import com.trendyol.shoppingcart.category.Category;
import com.trendyol.shoppingcart.enums.DiscountType;
import com.trendyol.shoppingcart.product.Campaign;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class DiscountFactoryTest {
    private Campaign c1;
    private Campaign c2;
    private List<Campaign> campaigns;
    private DiscountStrategy st1,st2;
    private List<DiscountStrategy> discountStrategies;


    @Before
    public void setUp() throws Exception {
        c1=new Campaign(new Category("men"),50,5, DiscountType.RATE);
        c2=new Campaign(new Category("women"),20,2,DiscountType.AMOUNT);
        campaigns=new ArrayList<>();
        campaigns.add(c1);
        campaigns.add(c2);
        st1=new RateDiscount(c1);
        st2=new AmountDiscount(c2);
        discountStrategies=new ArrayList<>();
        discountStrategies.add(st1);
        discountStrategies.add(st2);

    }

    @Test
    public void getDiscountStrategy() {
        List<DiscountStrategy> actual=DiscountFactory.getDiscountStrategy(campaigns);

        //assertThat(actual,);
    }


}