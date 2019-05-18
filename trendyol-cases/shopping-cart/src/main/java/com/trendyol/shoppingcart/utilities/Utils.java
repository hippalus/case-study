package com.trendyol.shoppingcart.utilities;

import java.text.DecimalFormat;

public class Utils {

    public static double formatTwoDigitsAfterComma(double number) throws NumberFormatException {
        return Double.parseDouble(new DecimalFormat("##.##").format(number));
    }

}
