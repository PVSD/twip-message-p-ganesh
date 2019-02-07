package com.company;
import java.util.*;

/**
 * Created by pg304 on 2/4/19.
 */
public class MessageList {
    private static ArrayList receivedMessages = new ArrayList();
    private static ArrayList sentMessages = new ArrayList();
    private static ArrayList allMessages = new ArrayList();


    public static void receiveMessage (Message m) {
        receivedMessages.add(m);
        allMessages.add(m);

        for (int j= 0;  j < allMessages.size(); j++ ) {
            System.out.println(allMessages.get(j));
        }
    }

    public static void sendMessage (Message m) {
        sentMessages.add(m);
        allMessages.add(m);

        for (int j= 0;  j < allMessages.size(); j++ ) {
            System.out.println(allMessages.get(j));
        }
    }

    public static void erase (){
        receivedMessages.clear();
        sentMessages.clear();
        allMessages.clear();
    }
}
