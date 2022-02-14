package com.company;

import com.company.call.Voice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOEE MY MOBILE SEVICE");
        System.out.println("what you want to do");
        System.out.println("............");

        int var  = 1;
        do
        {
            System.out.println("For video call press : 1");
            System.out.println("For voice call press : 2");
            System.out.println("for exit press : 0");
            var = sc.nextInt();

            if( var == 1)
            {
                System.out.println("write the person Number");
                sc.nextLine();
                String number = sc.nextLine();
                Voice voice = new Voice(number);
                voice.call();

                var = 0;
            }
            else if( var == 2)
            {
                System.out.println("voice calling ..... ");
                var = 0;
            }
            else
            {
                System.out.println(" plese write corrent num");
            }





        }
        while (var != 0 );



    }
}
