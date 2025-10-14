package org.withexception;

public class WithException {
    public static void main(String[] args) {
        int a =10;
        int b=0;
        int res=0;
        try{
            System.out.println("This is the line before an exception occurs");

            res = a/b;

            System.out.println("THis line will never execute because an " +
                    "exception will occur before this line");
        }
        catch (Exception e){
            System.out.println("Invalid division : "+ e.getClass());

        }

        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("res: "+res);

    }
}
