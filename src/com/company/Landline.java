package com.company;

public class Landline implements Telephone{
    private String myNumber;
    private boolean isRinging;

    public Landline(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Landline is always powered");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now Ringing " + phoneNumber + " on Landline");
    }

    @Override
    public void answer() {
     if (isRinging)
     {
         System.out.println("Answering the Landline Call");
         isRinging = false;
     } else
     {
         System.out.println("Phone is not Ringing");
     }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber)
        {
            isRinging = true;
            System.out.println("Phone is ringing");
        } else
        {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
