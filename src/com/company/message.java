package com.company;

/**
 * Created by pg304 on 2/4/19.
 */
public class Message {
    private String number;
    private String message;
    private long timeReceived;

    public Message (String num, String mess, long time){
        number = num;
        message = mess;
        timeReceived = time;
    }
}
