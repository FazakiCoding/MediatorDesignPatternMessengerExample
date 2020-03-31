package com.mediatordesignpattern;

public class Test {
    public static void main(String[] args) {

       IMessenger messenger=new Messenger();
      User u1=new MessengerUser(messenger,"1","sara");
      User u2=new MessengerUser(messenger,"2","brian");
      User u3=new MessengerUser(messenger,"3","alex");
      User u4=new MessengerUser(messenger,"4","kim");

      messenger.addUser(u1);
      messenger.addUser(u2);
      messenger.addUser(u3);
      messenger.addUser(u4);

      u2.send("Hi sara! how are you?","1");
      u1.send("I'm doing good! what about u?","2");
      u2.send("Great! ","1");
    }
}
