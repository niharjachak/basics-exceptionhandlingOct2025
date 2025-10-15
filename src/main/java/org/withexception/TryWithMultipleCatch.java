package org.withexception;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (RuntimeException r) {
            System.out.println("Dont divide by zero") ; // ----> Child
        }
        catch (Exception e){
            e.printStackTrace();      // // ----> Parent
        }
    }
}
