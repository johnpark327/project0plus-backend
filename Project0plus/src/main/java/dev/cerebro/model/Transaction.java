package dev.cerebro.model;

import javax.persistence.*;

@Entity // This annotation tells Spring that this is an Entity linked to a table in a database
public class Transaction {

    @Id // This annotation maps the ID in the table
    @GeneratedValue // This annotation enables Hibernate to auto generate an id that is specific to Hibernate
    private int tid;
    private int aid;
    private String type;
    private double amount;
    private String transaction_date;

    public Transaction() { super(); }

    public Transaction(int tid, int aid, String type, double amount, String transaction_date) {
        this.tid = tid;
        this.aid = aid;
        this.type = type;
        this.amount = amount;
        this.transaction_date = transaction_date;
    }

    public int getTid() { return tid; }

    public void setTid(int tid) { this.tid = tid; }

    public int getAid() { return aid; }

    public void setAid(int aid) { this.aid = aid; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }

    public String getTransaction_date() { return transaction_date; }

    public void setTransaction_date(String transaction_date) { this.transaction_date = transaction_date; }

    @Override
    public String toString() {
        return "Transaction{" +
                "tid=" + tid +
                ", aid=" + aid +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", transaction_date='" + transaction_date + '\'' +
                '}';
    }
}
