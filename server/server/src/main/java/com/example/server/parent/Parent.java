package com.example.server.parent;

import com.example.server.child.Child;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.hibernate.annotations.Formula;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "parent")
@Table
public class Parent {

    @Id
    private Integer id;
    private String sender;
    private String receiver;
    private Integer totalAmount;

    @OneToMany(mappedBy = "parent")
    @JsonManagedReference
    private List<Child> child = new ArrayList<>();


    @Formula(value = "(SELECT SUM(child.paid_amount) FROM child WHERE child.parent_id = id)")
    private Integer totalPaidAmount;



    public Parent() {
    }

    public Parent(Integer id, String sender, String receiver, Integer totalAmount) {
        this.id = id;
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

    public List<Child> getChild() {
        return child;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getTotalPaidAmount() {
        return totalPaidAmount;
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
