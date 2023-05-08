package com.example.server.child;

import com.example.server.parent.Parent;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity(name = "child")
@Table
public class Child {

    @Id
    @Column(name = "id")
    private Integer id;


    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "paid_amount")
    private Integer paidAmount;

    @ManyToOne
    @JoinColumn(name = "parent")
    @JsonBackReference
    private Parent parent;


    public Child() {
    }

    public Child(Integer id, Integer parentId, Integer paidAmount) {
        this.id = id;
        this.parentId = parentId;
        this.paidAmount = paidAmount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Integer paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Parent getParent() {
        return parent;
    }


    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", paidAmount=" + paidAmount +
                '}';
    }
}
