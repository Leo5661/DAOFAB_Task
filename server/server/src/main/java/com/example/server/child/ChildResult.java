package com.example.server.child;


public class ChildResult {

    private Integer id;
    private String sender;
    private String receiver;
    private Integer totalAmount;
    private Integer paidAmount;

    public ChildResult(Integer id, String sender, String receiver, Integer totalAmount, Integer paidAmount) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.totalAmount = totalAmount;
        this.paidAmount = paidAmount;
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

    public Integer getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Integer paidAmount) {
        this.paidAmount = paidAmount;
    }

    @Override
    public String toString() {
        return "ChildResult{" +
                "id=" + id +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", totalAmount=" + totalAmount +
                ", paidAmount=" + paidAmount +
                '}';
    }
}
