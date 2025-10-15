package org.withexception;

public class FinallyBlockCode {
    public static void main(String[] args) {
        try{
            System.out.println("Try block has executed");
        }catch (ArithmeticException e){
            // does not run becasue no exception caused
            System.out.println("Catch block has executed as well");
        }
        finally{
            System.out.println("The finally block has executed");
        }
    }
}
