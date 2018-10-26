package com.davidsells.models.Inventory;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class InventoryResponse {
    private Integer status;
    private String message;
    private Inventory inventory;

    public InventoryResponse() {
    }

    public InventoryResponse(Integer status, String message, Inventory inventory) {
        this.status = status;
        this.message = message;
        this.inventory = inventory;
    }

    @JsonProperty("result")
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "InventoryResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}
