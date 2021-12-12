package com.company;

public class Main {

    public static void main(String[] args) {
        BankAcccount bankAcccount = new BankAcccount();
        try {
            bankAcccount.depozit(20000);
        } catch (LimitException limitException) {
            limitException.printStackTrace();
        }
        while (true)
        try {
            bankAcccount.withDraw(6000);
        } catch (LimitException limitException){
            System.out.println(limitException.getMessage());
            try {
                bankAcccount.withDraw((int) limitException.getRemainingAmount());
            } catch (LimitException limitException1) {
                limitException1.printStackTrace();}
            break;

            }

        }
        }


    