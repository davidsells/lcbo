package com.davidsells.models.Inventory;

public class Inventory {
    private Integer product_id;
    private Integer store_id;
    private Boolean is_dead;
    private Integer quantity;
    private String updated_on;
    private String updated_at;
    private Integer product_no;
    private Integer store_no;

    public Inventory() {
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "product_id=" + product_id +
                ", store_id=" + store_id +
                ", is_dead=" + is_dead +
                ", quantity=" + quantity +
                ", updated_on='" + updated_on + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", product_no=" + product_no +
                ", store_no=" + store_no +
                '}';
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getStore_id() {
        return store_id;
    }

    public void setStore_id(Integer store_id) {
        this.store_id = store_id;
    }

    public Boolean getIs_dead() {
        return is_dead;
    }

    public void setIs_dead(Boolean is_dead) {
        this.is_dead = is_dead;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(String updated_on) {
        this.updated_on = updated_on;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getProduct_no() {
        return product_no;
    }

    public void setProduct_no(Integer product_no) {
        this.product_no = product_no;
    }

    public Integer getStore_no() {
        return store_no;
    }

    public void setStore_no(Integer store_no) {
        this.store_no = store_no;
    }
}
