package com.trendyol.shoppingcart.utilities;

import java.lang.reflect.Field;
import java.text.DecimalFormat;

public class Utils {

    public static double formatTwoDigitsAfterComma(double number) throws NumberFormatException {
        return Double.parseDouble(new DecimalFormat("##.##").format(number));
    }

    public static String toZtring(Object ob) {
        StringBuffer result = new StringBuffer();
       // String newLine = System.getProperty("line.separator");

       // result.append(ob.getClass().getName());
       // result.append(title+"  {");
        result.append("\n");

        //determine fields declared in this class only (no fields of superclass)
        Field[] fields = ob.getClass().getDeclaredFields();

        //print field names paired with their values
        for (Field field : fields) {
            result.append("  ");
            try {
                result.append(field.getName());
                result.append(": ");
                //requires access to private field:
                field.setAccessible(true);
                result.append(field.get(ob));
            } catch (IllegalAccessException ex) {
                System.out.println(ex);
            }
         //   result.append(newLine);
        }
        result.append("}");

        return result.toString();
    }

}
