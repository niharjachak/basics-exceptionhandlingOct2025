package org.withexception;

public class GenericExceptionEx {
    public static void main(String[] args) {
        try{
            int a=0;
            int b=8;
            int res =0;

            res=b/a;
            System.out.println("res: "+ res);
            String s1 = "JHJello";
            String s2=null;
            System.out.println(s1.length());
            System.out.println(s2.length());
        } catch (Exception e) {
            System.out.println("Exception has occured-- "+e.getMessage()+"--- "+e.getClass());
        }
    }
}
