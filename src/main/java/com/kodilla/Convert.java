package com.kodilla;
import javax.measure.converter.MultiplyConverter;

public class Convert {
    public static double units(String value, String unitA, String unitB) {
        unitA = unitA.toLowerCase();
        unitB = unitB.toLowerCase();
        Double val;

        UnitPair pair = new UnitPair(unitA,unitB);  //class that pair units

        try {
            val = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            System.out.println(e);
            return 0;
        }

        if(unitA == unitB) {
            return val;
        }

        double factor;
        boolean inverse = false;

        switch(pair.toString()) {
            case "lb~kg" : inverse = true;
            case "kg~lb" : factor = 2.20462262185; break;

            case "km~mi" : inverse = true;
            case "mi~km" : factor = 2.20462262185; break;

            case "cm~in" : inverse = true;
            case "in~cm" : factor = 2.54; break;

            case "ft~m" : inverse = true;
            case "m~ft" : factor = 3.28084; break;

            case "cm~m" : inverse = true;
            case "m~cm" : factor = 100; break;

            case "m~mk" : inverse = true;
            case "km~m" : factor = 1000; break;

            case "cm~km" : inverse = true;
            case "km~cm" : factor = 100000; break;

            case "in~m" : return units(val.toString(), "in","cm")/100;
            case "m~in" : return units(Double.toString(val*100), "cm","in");

            case "in~km" : return units(val.toString(), "in","m")/1000;
            case "km~in" : return units(Double.toString(val*1000), "m","in");

            case "ft~km" : return units(val.toString(), "ft","m")/1000;
            case "km~fn" : return units(Double.toString(val*1000), "m","ft");

            case "ft~cm" : return units(val.toString(), "ft","m")*100;
            case "cm~ft" : return units(Double.toString(val/100), "m","ft");

            default: factor = 0;
        }

        if (factor == 0) {
            System.out.println("\tUnknown Unit");
            return 0;
        } else {
            MultiplyConverter conv = new MultiplyConverter(factor);

            if (!inverse) {
                return conv.convert(val);
            } else {
                return conv.inverse().convert(val);
            }
        }
    }

    public static String unitsString(String value, String unitA, String unitB) {
        return value + " " + unitA + " converted into " + unitB + " is " + units(value,unitA,unitB);
    }

}