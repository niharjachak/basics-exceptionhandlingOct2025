package org.withexception;


        // if you don't add throws Exception to the method signature
        // it won't compile . every method that is defined and might
        // throw an exception should add throws in its method signature

public class ThrowsExample {
    public static void main(String[] args) throws InterruptedException {


        doStuff();
    }

    private static void doStuff() throws InterruptedException {
        doMoreStuff();
    }

    private static void doMoreStuff() throws InterruptedException{
        Thread.sleep(5000);
    }
}
