package dev.cerebro.model;

import javax.persistence.*;
import java.util.Set;

@Entity // This annotation tells Spring that this is an Entity linked to a table in a database
public class Client {

    @Id // This annotation maps the ID in the table
    @GeneratedValue // This annotation enables Hibernate to auto generate an id that is specific to Hibernate
    private int cid;
    private String fname;
    private String lname;
    private String username;
    private String password;
    private String email;
    private String role;

    @OneToMany(mappedBy = "cid", cascade = CascadeType.ALL, orphanRemoval = true) // This annotation lets the application know that one Account can have many Transactions.
    private Set<Account> accounts;

    public Client() { super(); }

    public Client(int cid, String fname, String lname, String username, String password, String email, String role) {
        this.cid = cid;
        this.fname = fname;
        this.lname = lname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public int getCid() { return cid; }

    public void setCid(int cid) { this.cid = cid; }

    public String getFname() { return fname; }

    public void setFname(String fname) { this.fname = fname; }

    public String getLname() { return lname; }

    public void setLname(String lname) { this.lname = lname; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getRole() { return role; }

    public void setRole(String role) { this.role = role; }

    @Override
    public String toString() {
        return "Client{" +
                "cid=" + cid +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
