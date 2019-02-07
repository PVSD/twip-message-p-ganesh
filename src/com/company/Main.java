package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String num;
        String text;
        String temp = "";

        while (!temp.equalsIgnoreCase("exit")) {

            System.out.println("Please enter your 10 digit phone number in the format: 0123456789");
            temp = kb.next();
            num = temp;
            System.out.println("Enter the message you would like to send:");
            temp = kb.next();
            text = temp;
            Message m = new Message(num, text, System.currentTimeMillis());
            MessageList.sendMessage(m);


        }
    }
}
