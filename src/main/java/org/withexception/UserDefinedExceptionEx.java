package org.withexception;

import org.exceptions.UserNotFoundException;

public class UserDefinedExceptionEx {
    public static void main(String[] args) {
        try{
            String user = null;
            if(user==null)
                    throw new UserNotFoundException();
        }
        catch (Exception e){
            System.out.println(e.getMessage()+"  "+e.getClass());

        }
    }
}
