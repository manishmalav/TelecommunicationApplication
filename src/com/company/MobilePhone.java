package com.company;

public class MobilePhone implements Telephone {

    private String myNumber;
    private boolean isRinging;
    private boolean isPowered;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowered = true;
        System.out.println("Mobile is Powered");
    }

    @Override
    public void dial(String myNumber) {
        System.out.println("Now Call is Coming from " + myNumber + " on Mobile");
    }

    @Override
    public void answer() {
        if (isRinging && isPowered) {
            System.out.println("Answering the Mobile phone");
            isRinging = false;
        } else {
            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (myNumber == phoneNumber && isPowered) {
            isRinging = true;
            System.out.println("Mobile is ringing");
        } else {
            System.out.println("Mobile number is wrong or Mobile is switched off");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {

        return isRinging;
    }
}

