package org.withexception;

public class FinallyBlockTwo {
    public static void main(String[] args) {

            try{
                System.out.println("Try block has executed");
                System.out.println(10/0);

                System.out.println("A line that never runs");

            }catch (ArithmeticException e){
                //  runs becasue exception caused
                System.out.println(e);
                System.out.println("Catch block has executed as well");
            }
            finally{
                System.out.println("The finally block has executed irrespective" +
                        " of exception occurring or not");
            }
        }
}

