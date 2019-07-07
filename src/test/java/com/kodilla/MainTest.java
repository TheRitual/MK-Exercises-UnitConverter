package com.kodilla;

import org.junit.Test;

import java.util.Random;

public class MainTest {
    @Test
    public void checkArguments() {
        String[] units = {"lb","kg","km","m","cm","ft","mi","in"};
        Random gen = new Random();
        for (String a : units) {
            for (String b : units) {
                String[] args = new String[3];
                args[0] = Integer.toString(gen.nextInt(100));
                args[1] = a;
                args[2] = b;
                System.out.println("\n\nTEST " + a + " on " + b);
                Main.main(args);
            }
        }
    }
}
