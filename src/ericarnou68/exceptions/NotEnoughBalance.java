package ericarnou68.exceptions;

public class NotEnoughBalance extends Exception {

    @Override
    public String getMessage(){
        return "Withdraw Error: Not Enough Balance";
    }
}
