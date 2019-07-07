package com.kodilla;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] bargs = new String[3];
        bargs[0] = "sfd";
        bargs[1] = "kg";
        bargs[2] = "lb";
        if(bargs.length == 3) {
            System.out.println(Convert.units("ss100","2","3"));
        } else {
            System.out.println("Invalid parameters. USAGE :::" +
                    "\n\t\t\"convert [value] [unitA] [unitB]\"" +
                    "\n\tConverts [value] from [unitA] to [unitB]" +
                    "\n example: \"convert 100 kg lb\"");
        }
    }
}
