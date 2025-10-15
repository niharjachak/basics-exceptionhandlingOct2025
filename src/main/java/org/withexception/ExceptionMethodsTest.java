package org.withexception;

public class ExceptionMethodsTest {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        } catch (Exception e) {
           e.printStackTrace(); // -name, description , location/stack trace
            System.out.println(e); // e.toString()  -- name description
            System.out.println(e.getMessage());  // only description
        }
    }
}
