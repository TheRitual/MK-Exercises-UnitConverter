package com.kodilla;

public class Main {
    public static void main(String[] args) {
        if(args.length == 3) {
            System.out.println(Convert.unitsString(args[0],args[1],args[2]));
        } else {
            System.out.println("Invalid parameters. USAGE :::" +
                    "\n\tconverter [value] [unitA] [unitB]\"" +
                    "\n\tConverts [value] from [unitA] to [unitB]" +
                    "\n\t\texample: \"converter 100 kg lb\"");
        }
    }
}
