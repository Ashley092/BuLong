package main.java.com.bulong.model;

public class Product {

    private Long id;
    private String productCode;
    private String productName;
    private Date createTime;
    private double width;
    private double density;
    private double blank;
    private boolean isDeleted;

    public Long getId() {
        return id;
    }
    public String getProductCode() {
        return productCode;
    }
    public String getProductName() {
        return productName;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public double getWidth() {
        return width;
    }
    public double getDensity() {
        return density;
    }
    public double getBlank() {
        return blank;
    }
    public boolean getIsDeleted() {
        return isDeleted;
    }

    public setProductCode(String newProductCode) {
        this.productCode = newProductCode;
    }
    public setProductName(String newProductName) {
        this.productName = newProductName;
    }

}

