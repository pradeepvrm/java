package com.pradeep.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }

//    lambda function
//    arr.forEach((item) -> System.out.println(item * 2));

    // lambda function with consumer type
    Consumer<Integer> fun = (item) -> System.out.println(item * 2);
    arr.forEach(fun);


    Operation sum = (a,b) -> a + b;
    Operation prod = (a, b ) -> a * b;
    Operation diff = (a, b) -> a - b;

    }
}

interface Operation {
    int operation(int a, int b);
}