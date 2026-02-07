package com.pradeep.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Pradeep = new Human(20, "Pradeep Verma");
//        Human twin = new Human(Pradeep);

        Human twin = (Human)Pradeep.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 10;
        twin.name = "John Doe";

        System.out.println(Arrays.toString(Pradeep.arr));
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(twin.name);
        System.out.println(Pradeep.name);

    }
}
