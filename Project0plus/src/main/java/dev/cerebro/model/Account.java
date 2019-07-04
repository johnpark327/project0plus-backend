package dev.cerebro.model;

import javax.persistence.*;
import java.util.Set;

@Entity // This annotation tells Spring that this is an Entity linked to a table in a database
public class Account {

    @Id // This annotation maps the ID in the table
    @GeneratedValue // This annotation enables Hibernate to auto generate an id that is specific to Hibernate
    private int aid;
    private int cid;
    private double amount;
    private String created;

    @OneToMany(mappedBy = "aid", cascade = CascadeType.ALL, orphanRemoval = true)  // This annotation lets the application know that one Account can have many Transactions.
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
