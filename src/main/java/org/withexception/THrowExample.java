package org.withexception;

import java.util.Scanner;

public class THrowExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try{
            if(n==25)                    // if the message is not sent it will print null
                throw new RuntimeException("n is 25 , hence throwing an exception");
        }
        catch (Exception e){
            System.out.println("Exception has occured "+ e.getMessage()+"-----"+e.getClass());
        }
    }
}
