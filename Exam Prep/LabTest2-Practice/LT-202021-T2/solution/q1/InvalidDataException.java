public class InvalidDataException extends Exception{
    public InvalidDataException(Throwable cause){
        super(cause.toString(), cause);
    }
    
}