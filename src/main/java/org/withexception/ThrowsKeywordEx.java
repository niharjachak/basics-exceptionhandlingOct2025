package org.withexception;

public class ThrowsKeywordEx {

    public static void demo() throws IllegalAccessException,InterruptedException {

            int a =30;

            if(a==10){
                throw new ArithmeticException("A is 10, and it is an Unchecked Exception");
            }

            if(a==20){
                throw new IllegalAccessException("A is 20 , and this is a checked Exception");
            }

            if(a==30){
                throw new NullPointerException("A is 10, and it is an Unchecked Exception");
            }

            if(a==10){
                throw new InterruptedException("A is 20 , and this is a checked Exception");
            }

    }

    public static void main(String[] args) {
        try{
            demo();

        }
        catch(Exception e ){
            System.out.println("Exception occured: "+e.getMessage()+"---"+e.getClass());
        }

    }
}
