package com.mediatordesignpattern;

public class MessengerUser extends User{

    public MessengerUser(IMessenger mediator, String id, String name) {
        super(mediator, id, name);
    }

    @Override
    public void send(String message, String userId) {
        System.out.println(this.getName()+"---Sending message----"+message);
        this.getMediator().sendMessage(message,userId);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.getName()+"---Receiving message----"+message);

    }
}
