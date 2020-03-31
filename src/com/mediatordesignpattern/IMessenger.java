package com.mediatordesignpattern;

public interface IMessenger {
      public void sendMessage(String message,String userId);
      public void addUser(User user);
}
