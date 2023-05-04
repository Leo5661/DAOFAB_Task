package com.example.server.parent;

public class Parent {
    private Integer id;
    private String sender;
    private String receiver;
    private Integer totalAmount;

    public Parent() {
    }

    public Parent(Integer id, String sender, String receiver, Integer totalAmount) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.totalAmount = totalAmount;
    }

    public Parent(String sender, String receiver, Integer totalAmount) {
        this.sender = sender;
        this.receiver = receiver;
        this.totalAmount = totalAmount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                '}';
    }
}
