package org.withexception;

public class ControlFLowTryCatch {
    public static void main(String[] args) {

        try{
            System.out.println("statement1");
            System.out.println(10/0);

            System.out.println("statement2");
            System.out.println("statement3");
        }
        catch(Exception e){
            System.out.println("statement4");
        }
        finally
        {
            System.out.println("statement5");
        }
    System.out.println("statement6");


    }
}
