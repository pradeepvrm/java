package com.pradeep.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 7   ;
        int b = 0;

        try {
//            divide(a, b);
              String name = "Pradeep";
              if (name.equals("Pradeep")) {
                  throw new MyException("name is Pradeep.");
              }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Normal exception.");
        } finally {
            System.out.println("this will always execute.");
        }
    }

    static int divide(int a , int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("don't divide by zero.");
        }
        return a / b;
    }
}
