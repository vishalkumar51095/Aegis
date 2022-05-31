package com.example.Aegis.domain;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private Long userId;

    private String firstName;
    private String lastName;
    private java.sql.Date dob;
    private String emailId;
    private String mobileNo;
    private Double balance;
    private String password;
    private String address;
    //@OneToMany(mappedBy = "User_Role")
    @ManyToOne
    @JoinColumn(name = "user_role_role_id")
    private User_Role userRole;
    public User() {
        super();
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", emailId='" + emailId + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", userRole=" + userRole +
                '}';
    }

    public User(Long userId, String firstName, String lastName, java.sql.Date dob, String emailId, String mobileNo, Double balance, String password, String address, User_Role userRole) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
        this.balance = balance;
        this.password = password;
        this.address = address;
        this.userRole = userRole;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public java.sql.Date getDob() {
        return dob;
    }

    public void setDob(java.sql.Date dob) {
        this.dob = dob;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User_Role getUserRole() {
        return userRole;
    }

    public void setUserRole(User_Role userRole) {
        this.userRole = userRole;
    }
}
