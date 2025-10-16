package org.withexception;

public class ReturnVsFinally {

    // the finally block of code is designed to run irrespective of the try
    // exception occuring or not
    //it being handled or not
    public static void main(String[] args) {
        try {
            System.out.println("try block executed");
            return;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally block code runs even if " +
                    "return is mentioned");
        }


    }
}
