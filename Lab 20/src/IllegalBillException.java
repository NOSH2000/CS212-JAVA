
public class IllegalBillException extends IllegalArgumentException{
    public IllegalBillException(String message){ //Bill amount is not right
        super(message); // super class constructor
    }
    
}
