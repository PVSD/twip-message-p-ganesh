package com.company;
import java.util.*;

/**
 * Created by pg304 on 2/4/19.
 */
public class MessageList {
    public static ArrayList receivedMessages = new ArrayList();
    public static ArrayList sentMessages = new ArrayList();
    public static ArrayList allMessages = new ArrayList();


    public static void receiveMessage (Message m) {
        receivedMessages.add(m);
        allMessages.add(m);
    }

    public static void sendMessage (Message m) {
        sentMessages.add(m);
        allMessages.add(m);
    }

    public static void erase (){
        receivedMessages.clear();
        sentMessages.clear();
        allMessages.clear();
    }
}
