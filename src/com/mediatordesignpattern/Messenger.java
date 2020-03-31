package com.mediatordesignpattern;

import java.util.HashMap;
import java.util.Map;

public class Messenger implements IMessenger {

    private Map<String,User> Users=new HashMap<String,User>();

    @Override
    public void sendMessage(String message, String userId) {
        User u=this.Users.get(userId);
        u.receive(message);
    }

    @Override
    public void addUser(User user) {
        this.Users.put(user.getId(),user);
    }
}
