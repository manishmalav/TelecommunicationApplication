package com.company.call;

import com.company.phone.AllPhones;
import com.company.phone.Phone;

import java.util.ArrayList;

public class Voice {

    private final String number;

    public Voice(String number) {
        this.number = number;
    }

    public void call() {
        AllPhones allPhones = new AllPhones();
        ArrayList<Phone> phones = (ArrayList<Phone>) allPhones.getPhoneList();
        // System.out.println(phones.size());
        for (int i = 0; i < phones.size(); i++) {
            Phone phone = phones.get(i);
            if (number.equals(phone.getMobNumber())) {
                //System.out.println(number+" "+phone.getName()+" "+ phone.getMobNumber());
                if (phone.isVoiceCall() == true) {
                    System.out.println("calling " + phone.getName());
                } else {
                    System.out.println("Voice call not possible in yout phone " + phone.getName());
                }
            }
        }

    }
}
