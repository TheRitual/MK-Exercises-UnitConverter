package com.kodilla;
import javax.measure.converter.MultiplyConverter;

public class Convert {
    public static double units(String value, String unitA, String unitB) {

        Double val = 0.0;

        UnitPair pair = new UnitPair(unitA,unitB);  //class that pair units

        try {
            val = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        MultiplyConverter conv;
        switch()

        return conv.inverse().convert(val);
    }

}