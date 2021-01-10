package exception;

import java.sql.SQLException;

public class ExceptionExperiment {
    public static void main(String[] args){
        try{
            checkedExceptionTest();
        } catch(SQLException s){
            System.out.println("Thrown: "+s.toString());
        }
//        uncheckedExceptionTest();
        CustomException ce = new CustomException("Error"); // custom exception classes is java
    }

    // checked exceptions are checked in compile time and the compiler will force us to handle them
    public static void checkedExceptionTest() throws SQLException{
        throw new SQLException();
    }

    // unchecked exception are not checked at compile time but rather at run time
    // the compiler will not force us to handle the exception
    public static void uncheckedExceptionTest(){
        throw new NullPointerException();
    }
}

//    custom exception classes is java
class CustomException extends Exception{
    CustomException(String message){
        super(message);
    }
}