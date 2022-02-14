package com.company.phone;

import java.util.ArrayList;
import java.util.List;

public class AllPhones {

    List<Phone> phoneList;

    public AllPhones()
    {
        Phone p1 = new Phone("Piyush", "8955",true, true);
        Phone p2 = new Phone("manish", "9783",true, false);
        Phone p3 = new Phone("chirag", "7351",true,true);

        phoneList = new ArrayList<Phone>();
        phoneList.add(p1);
        phoneList.add(p2);
        phoneList.add(p3);
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }
}
