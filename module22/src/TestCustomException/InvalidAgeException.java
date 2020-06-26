package TestCustomException;

public class InvalidAgeException extends Exception {
    private String s;
    InvalidAgeException(String s){
        this.s=s;
    }
    @Override
    public String getMessage(){
        return s;
    }
}
