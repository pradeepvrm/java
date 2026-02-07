package com.pradeep.cloning;

public class Human implements Cloneable {
    String name;
    int age;
    int[] arr;

   public Human(int age, String name) {
       this.age = age;
       this.name = name;
       this.arr = new int[]{1,2,3,4,5};
   }

//   @Override
//   public Object clone() throws CloneNotSupportedException {
////       shallow copy
//       return super.clone();
//   }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human) super.clone(); // this is still a shallow copy.

        // making deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }

}
