package org.withexception;

import org.exceptions.TooOldException;
import org.exceptions.TooYoungException;

import java.util.Scanner;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();

        if(age <18){
            throw new TooYoungException("You are too young to get married!" +
                    "Go study");
        }
        else if(age >60){
            throw new TooOldException("You are about to die ! Why get married now");
        }
        else{
            System.out.println("You will get your match soon!!");
        }
    }
}
