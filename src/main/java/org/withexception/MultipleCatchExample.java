package org.withexception;

public class MultipleCatchExample {

    public static void main(String[] args) {
        try{
            int a=2;
            int b=10;
            int res =0;

            res=b/a;
            System.out.println("res: "+ res);
            String s1 = "JHJello";
            String s2=null;
            System.out.println(s1.length());
            System.out.println(s2.length());
        } catch (ArithmeticException e) {
            System.out.println("Exception has occured-- "+e.getMessage()+"--- "+e.getClass());
        } catch (NullPointerException n) {
            System.out.println("Exception has occured-- "+n.getMessage()+"--- "+n.getClass());
        }
    }
}
