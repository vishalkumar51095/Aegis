package com.example.Aegis.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User_Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "purchase_id", nullable = false)
    private Long purchaseId;
    private Date purchaseDate;
    //@OneToMany(mappedBy = "Product")
    @ManyToOne
    @JoinColumn(name = "product_id_product_id")
    private Product productId;
    private int totalUnit;
   // @OneToMany(mappedBy = "User")
    @ManyToOne
    @JoinColumn(name = "purchase_by_user_user_id")
    private User purchaseByUser;
    //@OneToMany(mappedBy = "User")
    @ManyToOne
    @JoinColumn(name = "purchase_from_user_user_id")
    private User purchaseFromUser;

    @Override
    public String toString() {
        return "User_Purchase{" +
                "purchaseId=" + purchaseId +
                ", purchaseDate=" + purchaseDate +
                ", productId=" + productId +
                ", totalUnit=" + totalUnit +
                ", purchaseByUser='" + purchaseByUser + '\'' +
                ", purchaseFromUser='" + purchaseFromUser + '\'' +
                '}';
    }

    public User_Purchase(Long purchaseId, Date purchaseDate, Product productId, int totalUnit, User purchaseByUser, User purchaseFromUser) {
        this.purchaseId = purchaseId;
        this.purchaseDate = purchaseDate;
        this.productId = productId;
        this.totalUnit = totalUnit;
        this.purchaseByUser = purchaseByUser;
        this.purchaseFromUser = purchaseFromUser;
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public User_Purchase() {
    }


    public User_Purchase(int purchaseId, Date purchaseDate, Product productId, int totalUnit, User purchaseByUser, User purchaseFromUser) {
       super();
        this.purchaseDate = purchaseDate;
        this.productId = productId;
        this.totalUnit = totalUnit;
        this.purchaseByUser = purchaseByUser;
        this.purchaseFromUser = purchaseFromUser;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public int getTotalUnit() {
        return totalUnit;
    }

    public void setTotalUnit(int totalUnit) {
        this.totalUnit = totalUnit;
    }

    public User getPurchaseByUser() {
        return purchaseByUser;
    }

    public void setPurchaseByUser(User purchaseByUser) {
        this.purchaseByUser = purchaseByUser;
    }

    public User getPurchaseFromUser() {
        return purchaseFromUser;
    }

    public void setPurchaseFromUser(User purchaseFromUser) {
        this.purchaseFromUser = purchaseFromUser;
    }
}
