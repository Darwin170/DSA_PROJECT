package models;

abstract class Product {
    private String productName;  
    private String productImage;
    private boolean isSelected = false;

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }
    


    public String getProductImage() {
        return this.productImage;
    }

    public void setProductImage(String path) {
        this.productImage = path;
    }

    public boolean getProductStatus() {
        return this.isSelected;
    }

    public void setProductStatus(boolean status) {
        this.isSelected = status;
    }

}