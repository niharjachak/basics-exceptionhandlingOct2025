package org.withexception;


    // in case of try catch and finally returning values
    // the finally block's return will be considered
public class ReturnvsFinallyTwo {
    public static void main(String[] args) {
        System.out.println(methodOne());
    }

    private static int methodOne() {
        try{
            System.out.println(10/0);
            return 6969;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 1000;
        }finally {
            System.out.println("Finally block is running");
            return 99999;
        }
    }
}
