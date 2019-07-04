package dev.cerebro.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private int aid;
    private int cid;
    private double amount;
    private String created;

    @OneToMany(mappedBy = "aid", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Transaction> transactions;

    public Account() {
        super();
    }

    public Account (int aid, int cid, double amount, String created) {
        this.aid = aid;
        this.cid = cid;
        this.amount = amount;
        this.created = created;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", cid=" + cid +
                ", amount=" + amount +
                ", created='" + created + '\'' +
                '}';
    }
}
