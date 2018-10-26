package com.davidsells.models.selection;

public class Wine {
    private Integer productNumber;
    private String name;
    private String country;
    private String producer;
    private Integer price;
    private Float showPrice;
    private String vintage;
    private String varietal;
    private Boolean isOnSale;
    private String type;

    public Wine(Integer productNumber, String name, String country, String producer, Integer price,Float showPrice, String vintage, String varietal, String type, Boolean isOnSale) {
        this.productNumber =productNumber;
        this.name = name;
        this.country = country;
        this.producer = producer;
        this.price = price;
        this.showPrice = showPrice;
        this.vintage = vintage;
        this.varietal = varietal;
        this.type = type;
        this.isOnSale = isOnSale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getVintage() {
        return vintage;
    }

    public void setVintage(String vintage) {
        this.vintage = vintage;
    }

    public String getVarietal() {
        return varietal;
    }

    public void setVarietal(String varietal) {
        this.varietal = varietal;
    }

    public Boolean getOnSale() {
        return isOnSale;
    }

    public void setOnSale(Boolean onSale) {
        isOnSale = onSale;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Float getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(Float showPrice) {
        this.showPrice = showPrice;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "productNumber=" + productNumber +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", vintage='" + vintage + '\'' +
                ", varietal='" + varietal + '\'' +
                ", isOnSale=" + isOnSale +
                ", type='" + type + '\'' +
                '}';
    }

}
