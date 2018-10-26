package com.davidsells.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pager {
    private Integer records_per_page;
    private Integer total_record_count;
    private Integer current_page_record_count;
    private Boolean is_first_page;
    private Boolean is_final_page;
    private Integer current_page;
    private String current_page_path;
    private Integer next_page;
    private String next_page_path;
    private Integer previous_page;
    private String previous_page_path;
    private Integer total_pages;
    private String total_pages_path;

    public Pager() {
    }

    public Integer getRecords_per_page() {
        return records_per_page;
    }

    public void setRecords_per_page(Integer records_per_page) {
        this.records_per_page = records_per_page;
    }

    public Integer getTotal_record_count() {
        return total_record_count;
    }

    public void setTotal_record_count(Integer total_record_count) {
        this.total_record_count = total_record_count;
    }

    public Integer getCurrent_page_record_count() {
        return current_page_record_count;
    }

    public void setCurrent_page_record_count(Integer current_page_record_count) {
        this.current_page_record_count = current_page_record_count;
    }

    public Boolean getIs_first_page() {
        return is_first_page;
    }

    public void setIs_first_page(Boolean is_first_page) {
        this.is_first_page = is_first_page;
    }

    public Boolean getIs_final_page() {
        return is_final_page;
    }

    public void setIs_final_page(Boolean is_final_page) {
        this.is_final_page = is_final_page;
    }

    public Integer getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(Integer current_page) {
        this.current_page = current_page;
    }

    public String getCurrent_page_path() {
        return current_page_path;
    }

    public void setCurrent_page_path(String current_page_path) {
        this.current_page_path = current_page_path;
    }

    public Integer getNext_page() {
        return next_page;
    }

    public void setNext_page(Integer next_page) {
        this.next_page = next_page;
    }

    public String getNext_page_path() {
        return next_page_path;
    }

    public void setNext_page_path(String next_page_path) {
        this.next_page_path = next_page_path;
    }

    public Integer getPrevious_page() {
        return previous_page;
    }

    public void setPrevious_page(Integer previous_page) {
        this.previous_page = previous_page;
    }

    public String getPrevious_page_path() {
        return previous_page_path;
    }

    public void setPrevious_page_path(String previous_page_path) {
        this.previous_page_path = previous_page_path;
    }

    public Integer getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(Integer total_pages) {
        this.total_pages = total_pages;
    }

    public String getTotal_pages_path() {
        return total_pages_path;
    }

    public void setTotal_pages_path(String total_pages_path) {
        this.total_pages_path = total_pages_path;
    }

    @Override
    public String toString() {
        return "Pager{" +
                "records_per_page=" + records_per_page +
                ", total_record_count=" + total_record_count +
                ", current_page_record_count=" + current_page_record_count +
                ", is_first_page=" + is_first_page +
                ", is_final_page=" + is_final_page +
                ", current_page=" + current_page +
                ", current_page_path='" + current_page_path + '\'' +
                ", next_page=" + next_page +
                ", next_page_path='" + next_page_path + '\'' +
                ", previous_page=" + previous_page +
                ", previous_page_path='" + previous_page_path + '\'' +
                ", total_pages=" + total_pages +
                ", total_pages_path='" + total_pages_path + '\'' +
                '}';
    }
}
