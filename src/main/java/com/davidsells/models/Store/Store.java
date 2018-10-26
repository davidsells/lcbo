package com.davidsells.models.Store;

public class Store {
    private Integer id;
    private Boolean is_dead;
    private String name;
    private String tags;
    private String address_line_1;
    private String address_line_2;
    private String city;
    private String postal_code;
    private String telephone;
    private String fax;
    private Float latitude;
    private Float longitude;
    private Integer products_count;
    private Integer inventory_count;
    private Integer inventory_price_in_cents;
    private Integer inventory_volume_in_milliliters;
    private Boolean has_wheelchair_accessability;
    private Boolean has_bilingual_services;
    private Boolean has_product_consultant;
    private Boolean has_tasting_bar;
    private Boolean has_beer_cold_room;
    private Boolean has_special_occasion_permits;
    private Boolean has_vintages_corner;
    private Boolean has_parking;
    private Boolean has_transit_access;
    private Integer sunday_open;
    private Integer sunday_close;
    private Integer monday_open;
    private Integer monday_close;
    private Integer tuesday_open;
    private Integer tuesday_close;
    private Integer wednesday_open;
    private Integer wednesday_close;
    private Integer thursday_open;
    private Integer thursday_close;
    private Integer friday_open;
    private Integer friday_close;
    private Integer saturday_open;
    private Integer saturday_close;
    private String updated_at;
    private Integer store_no;

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", is_dead=" + is_dead +
                ", name='" + name + '\'' +
                ", tags='" + tags + '\'' +
                ", address_line_1='" + address_line_1 + '\'' +
                ", address_line_2='" + address_line_2 + '\'' +
                ", city='" + city + '\'' +
                ", postal_code='" + postal_code + '\'' +
                ", telephone='" + telephone + '\'' +
                ", fax='" + fax + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", products_count=" + products_count +
                ", inventory_count=" + inventory_count +
                ", inventory_price_in_cents=" + inventory_price_in_cents +
                ", inventory_volume_in_milliliters=" + inventory_volume_in_milliliters +
                ", has_wheelchair_accessability=" + has_wheelchair_accessability +
                ", has_bilingual_services=" + has_bilingual_services +
                ", has_product_consultant=" + has_product_consultant +
                ", has_tasting_bar=" + has_tasting_bar +
                ", has_beer_cold_room=" + has_beer_cold_room +
                ", has_special_occasion_permits=" + has_special_occasion_permits +
                ", has_vintages_corner=" + has_vintages_corner +
                ", has_parking=" + has_parking +
                ", has_transit_access=" + has_transit_access +
                ", sunday_open=" + sunday_open +
                ", sunday_close=" + sunday_close +
                ", monday_open=" + monday_open +
                ", monday_close=" + monday_close +
                ", tuesday_open=" + tuesday_open +
                ", tuesday_close=" + tuesday_close +
                ", wednesday_open=" + wednesday_open +
                ", wednesday_close=" + wednesday_close +
                ", thursday_open=" + thursday_open +
                ", thursday_close=" + thursday_close +
                ", friday_open=" + friday_open +
                ", friday_close=" + friday_close +
                ", saturday_open=" + saturday_open +
                ", saturday_close=" + saturday_close +
                ", updated_at='" + updated_at + '\'' +
                ", store_no=" + store_no +
                '}';
    }

    public Store() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIs_dead() {
        return is_dead;
    }

    public void setIs_dead(Boolean is_dead) {
        this.is_dead = is_dead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getAddress_line_1() {
        return address_line_1;
    }

    public void setAddress_line_1(String address_line_1) {
        this.address_line_1 = address_line_1;
    }

    public String getAddress_line_2() {
        return address_line_2;
    }

    public void setAddress_line_2(String address_line_2) {
        this.address_line_2 = address_line_2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Integer getProducts_count() {
        return products_count;
    }

    public void setProducts_count(Integer products_count) {
        this.products_count = products_count;
    }

    public Integer getInventory_count() {
        return inventory_count;
    }

    public void setInventory_count(Integer inventory_count) {
        this.inventory_count = inventory_count;
    }

    public Integer getInventory_price_in_cents() {
        return inventory_price_in_cents;
    }

    public void setInventory_price_in_cents(Integer inventory_price_in_cents) {
        this.inventory_price_in_cents = inventory_price_in_cents;
    }

    public Integer getInventory_volume_in_milliliters() {
        return inventory_volume_in_milliliters;
    }

    public void setInventory_volume_in_milliliters(Integer inventory_volume_in_milliliters) {
        this.inventory_volume_in_milliliters = inventory_volume_in_milliliters;
    }

    public Boolean getHas_wheelchair_accessability() {
        return has_wheelchair_accessability;
    }

    public void setHas_wheelchair_accessability(Boolean has_wheelchair_accessability) {
        this.has_wheelchair_accessability = has_wheelchair_accessability;
    }

    public Boolean getHas_bilingual_services() {
        return has_bilingual_services;
    }

    public void setHas_bilingual_services(Boolean has_bilingual_services) {
        this.has_bilingual_services = has_bilingual_services;
    }

    public Boolean getHas_product_consultant() {
        return has_product_consultant;
    }

    public void setHas_product_consultant(Boolean has_product_consultant) {
        this.has_product_consultant = has_product_consultant;
    }

    public Boolean getHas_tasting_bar() {
        return has_tasting_bar;
    }

    public void setHas_tasting_bar(Boolean has_tasting_bar) {
        this.has_tasting_bar = has_tasting_bar;
    }

    public Boolean getHas_beer_cold_room() {
        return has_beer_cold_room;
    }

    public void setHas_beer_cold_room(Boolean has_beer_cold_room) {
        this.has_beer_cold_room = has_beer_cold_room;
    }

    public Boolean getHas_special_occasion_permits() {
        return has_special_occasion_permits;
    }

    public void setHas_special_occasion_permits(Boolean has_special_occasion_permits) {
        this.has_special_occasion_permits = has_special_occasion_permits;
    }

    public Boolean getHas_vintages_corner() {
        return has_vintages_corner;
    }

    public void setHas_vintages_corner(Boolean has_vintages_corner) {
        this.has_vintages_corner = has_vintages_corner;
    }

    public Boolean getHas_parking() {
        return has_parking;
    }

    public void setHas_parking(Boolean has_parking) {
        this.has_parking = has_parking;
    }

    public Boolean getHas_transit_access() {
        return has_transit_access;
    }

    public void setHas_transit_access(Boolean has_transit_access) {
        this.has_transit_access = has_transit_access;
    }

    public Integer getSunday_open() {
        return sunday_open;
    }

    public void setSunday_open(Integer sunday_open) {
        this.sunday_open = sunday_open;
    }

    public Integer getSunday_close() {
        return sunday_close;
    }

    public void setSunday_close(Integer sunday_close) {
        this.sunday_close = sunday_close;
    }

    public Integer getMonday_open() {
        return monday_open;
    }

    public void setMonday_open(Integer monday_open) {
        this.monday_open = monday_open;
    }

    public Integer getMonday_close() {
        return monday_close;
    }

    public void setMonday_close(Integer monday_close) {
        this.monday_close = monday_close;
    }

    public Integer getTuesday_open() {
        return tuesday_open;
    }

    public void setTuesday_open(Integer tuesday_open) {
        this.tuesday_open = tuesday_open;
    }

    public Integer getTuesday_close() {
        return tuesday_close;
    }

    public void setTuesday_close(Integer tuesday_close) {
        this.tuesday_close = tuesday_close;
    }

    public Integer getWednesday_open() {
        return wednesday_open;
    }

    public void setWednesday_open(Integer wednesday_open) {
        this.wednesday_open = wednesday_open;
    }

    public Integer getWednesday_close() {
        return wednesday_close;
    }

    public void setWednesday_close(Integer wednesday_close) {
        this.wednesday_close = wednesday_close;
    }

    public Integer getThursday_open() {
        return thursday_open;
    }

    public void setThursday_open(Integer thursday_open) {
        this.thursday_open = thursday_open;
    }

    public Integer getThursday_close() {
        return thursday_close;
    }

    public void setThursday_close(Integer thursday_close) {
        this.thursday_close = thursday_close;
    }

    public Integer getFriday_open() {
        return friday_open;
    }

    public void setFriday_open(Integer friday_open) {
        this.friday_open = friday_open;
    }

    public Integer getFriday_close() {
        return friday_close;
    }

    public void setFriday_close(Integer friday_close) {
        this.friday_close = friday_close;
    }

    public Integer getSaturday_open() {
        return saturday_open;
    }

    public void setSaturday_open(Integer saturday_open) {
        this.saturday_open = saturday_open;
    }

    public Integer getSaturday_close() {
        return saturday_close;
    }

    public void setSaturday_close(Integer saturday_close) {
        this.saturday_close = saturday_close;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getStore_no() {
        return store_no;
    }

    public void setStore_no(Integer store_no) {
        this.store_no = store_no;
    }
}
