package com.example.server.child;

public class Child {
    private Integer id;
    private Integer parentId;
    private Integer paidAmount;

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

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", paidAmount=" + paidAmount +
                '}';
    }
}
