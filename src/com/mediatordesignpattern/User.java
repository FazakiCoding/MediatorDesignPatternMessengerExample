package com.mediatordesignpattern;

public abstract class User {
    private IMessenger mediator;
    private String Id;
    private String Name;

    public User(IMessenger mediator, String id, String name) {
        this.mediator = mediator;
        Id = id;
        Name = name;
    }

    public abstract void send(String message,String userId);
    public abstract void receive(String message);


    public IMessenger getMediator() {
        return mediator;
    }

    public void setMediator(IMessenger mediator) {
        this.mediator = mediator;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
