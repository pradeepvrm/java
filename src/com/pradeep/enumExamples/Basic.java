package com.pradeep.enumExamples;

public class Basic {
    enum Week implements A {
        // enum constants
        // public, static and final
        // type = Week
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week() {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("hey how are you");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));

//        for (Week day : Week.values()) {
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal());
    }

}
