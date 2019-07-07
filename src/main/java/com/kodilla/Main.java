package com.kodilla;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test2!");
        Arrays.stream(args).forEach(System.out::println);
    }
}
