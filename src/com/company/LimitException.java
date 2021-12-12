package com.company;

public class LimitException extends Exception{
   public double remainingAmount;

    public LimitException(String message) {

    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;

    }
}
