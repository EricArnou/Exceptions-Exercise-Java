package ericarnou68.exceptions;

public class AmountExceedsWithdrawLimit extends Exception {

    @Override
    public String getMessage(){
        return "Withdraw Error: The amount exceeds the withdraw limit";
    }
}
