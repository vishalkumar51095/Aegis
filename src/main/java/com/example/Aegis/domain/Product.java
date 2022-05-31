package com.example.Aegis.domain;
import org.hibernate.type.descriptor.sql.TinyIntTypeDescriptor;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id", nullable = false)
    private Long productId;
    private String productName;
    private String productDesc;
    private String productImg;
    private Double productSellPrice;
    private Double productCostPrice;
    private int stockUnit;
    //@OneToMany(mappedBy = "User")
    private String createdByUser;
    private Date createDate;
    private TinyIntTypeDescriptor isDeleted;


    public Product() {
        super();
    }

    public Product(String productName, String productDesc, String productImg, Double productSellPrice, Double productCostPrice, int stockUnit, String createdByUser, Date createDate, TinyIntTypeDescriptor isDeleted) {
        this.productName = productName;
        this.productDesc = productDesc;
        this.productImg = productImg;
        this.productSellPrice = productSellPrice;
        this.productCostPrice = productCostPrice;
        this.stockUnit = stockUnit;
        this.createdByUser = createdByUser;
        this.createDate = createDate;
        this.isDeleted = isDeleted;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
