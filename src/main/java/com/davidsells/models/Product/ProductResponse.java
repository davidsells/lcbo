package com.davidsells.models.Product;

import com.davidsells.models.Pager;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductResponse {
    private Integer status;
    private String message;
    private Pager pager;
    private List<Product> result;
    private String suggestions;

//    @JsonFormat(shape= JsonFormat.Shape.ARRAY)
    @JsonProperty("result")
    public List<Product> getResult() {
        return result;
    }

    public void setResult(List<Product> result) {
        this.result = result;
    }

    public ProductResponse() {
    }

    public ProductResponse(Integer status, String message, Pager pager, List<Product> result, String suggestions) {
        this.status = status;
        this.message = message;
        this.pager = pager;
        this.result = result;
        this.suggestions = suggestions;
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


    public String getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }

    @Override
    public String toString() {
        return "ProductResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", pager=" + pager +
                ", result=" + result +
                ", suggestions='" + suggestions + '\'' +
                '}';
    }
}
