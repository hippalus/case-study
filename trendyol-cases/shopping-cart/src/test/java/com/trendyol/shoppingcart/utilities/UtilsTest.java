package com.trendyol.shoppingcart.utilities;

import com.trendyol.shoppingcart.cart.CartResult;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class UtilsTest{


    @Test
    public void formatNumberOfDigitsAfterComma() {
        double num=65.54665636511212;
        double actual=Utils.formatTwoDigitsAfterComma(num);
        assertEquals(65.55,actual,0);
    }

    @Test
    public void testToString(){
        CartResult cr = new CartResult();
        try {
            Field field =cr.getClass().getDeclaredField("totalAmountAfterDiscount");
            field.setAccessible(true);
            field.get(cr);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}