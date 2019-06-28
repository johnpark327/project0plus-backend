package dev.cerebro.model;

public class Client {
    private int cid;
    private String fname;
    private String lname;
    private String username;
    private String password;
    private String email;
    private String role;

    public Client() {
        super();
    }

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
