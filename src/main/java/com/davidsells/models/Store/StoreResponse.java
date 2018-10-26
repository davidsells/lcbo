package com.davidsells.models.Store;

import com.davidsells.models.Pager;
import com.davidsells.models.Store.Store;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreResponse {
    private Integer status;
    private String message;
    private Pager pager;
    private List<Store> result;

    @JsonProperty("result")
    public List<Store> getResult() {
        return result;
    }

    public void setResult(List<Store> result) {
        this.result = result;
    }

    public StoreResponse() {
    }

    public StoreResponse(Integer status, String message, Pager pager, List<Store> result) {
        this.status = status;
        this.message = message;
        this.pager = pager;
        this.result = result;
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

    public Pager getPager() {
        return pager;
    }

    public void setPager(Pager pager) {
        this.pager = pager;
    }


    @Override
    public String toString() {
        return "StoreResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", pager=" + pager +
                ", result=" + result +
                '}';
    }
}
