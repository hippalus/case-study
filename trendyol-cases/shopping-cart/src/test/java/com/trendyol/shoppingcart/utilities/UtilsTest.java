package com.trendyol.shoppingcart.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest{


    @Test
    public void formatNumberOfDigitsAfterComma() {
        double num=65.54665636511212;
        double actual=Utils.formatTwoDigitsAfterComma(num);
        assertEquals(65.55,actual,0);
    }
}