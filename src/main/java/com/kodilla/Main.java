package com.kodilla;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] bargs = new String[3];
        bargs[0] = "15";
        bargs[1] = "ft";
        bargs[2] = "km";
        if(bargs.length == 3) {
            System.out.println(Convert.unitsString(bargs[0],bargs[1],bargs[2]));
        } else {
            System.out.println("Invalid parameters. USAGE :::" +
                    "\n\t\t\"convert [value] [unitA] [unitB]\"" +
                    "\n\tConverts [value] from [unitA] to [unitB]" +
                    "\n example: \"convert 100 kg lb\"");
        }
    }
}
