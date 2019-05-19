package com.trendyol.shoppingcart.cart;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CartResultTest {
private  CartResult result;
    @Before
    public void setUp() throws Exception {
        result=new CartResult();
    }

    @Test
    public void toStr() {
       String s= result.toString();
        System.out.println(s);
        assertEquals(1,1);
    }
}