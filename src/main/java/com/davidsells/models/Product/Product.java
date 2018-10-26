package com.davidsells.models.Product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    private Integer id;
    private Boolean is_dead;
    private String name;
    private String tags;
    private Boolean is_discontinued;
    private Integer price_in_cents;
    private Integer regular_price_in_cents;
    private Integer limited_time_offer_savings_in_cents;
    private String limited_time_offer_ends_on;
    private Integer bonus_reward_miles;
    private String bonus_reward_miles_ends_on;
    private String stock_type;
    private String primary_category;
    private String secondary_category;
    private String origin;
//    private String package;
    private String package_unit_type;
    private Integer package_unit_volume_in_milliliters;
    private Integer total_package_units;
    private Integer volume_in_milliliters;
    private Integer alcohol_content;
    private Integer price_per_liter_of_alcohol_in_cents;
    private Integer price_per_liter_in_cents;
    private Integer inventory_count;
    private Integer inventory_volume_in_milliliters;
    private Integer inventory_price_in_cents;
    private String sugar_content;
    private String producer_name;
    private String released_on;
    private Boolean has_value_added_promotion;
    private Boolean has_limited_time_offer;
    private Boolean has_bonus_reward_miles;
    private Boolean is_seasonal;
    private Boolean is_vqa;
    private Boolean is_ocb;
    private Boolean is_kosher;
    private String value_added_promotion_description;
    private String description;
    private String serving_suggestion;
    private String tasting_note;
    private String updated_at;
    private String image_thumb_url;
    private String image_url;
    private String varietal;
    private String style;
    private String tertiary_category;
    private Integer sugar_in_grams_per_liter;
    private Integer clearance_sale_savings_in_cents;
    private Boolean has_clearance_sale;
    private Integer product_no;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", is_dead=" + is_dead +
                ", name='" + name + '\'' +
                ", tags='" + tags + '\'' +
                ", is_discontinued=" + is_discontinued +
                ", price_in_cents=" + price_in_cents +
                ", regular_price_in_cents=" + regular_price_in_cents +
                ", limited_time_offer_savings_in_cents=" + limited_time_offer_savings_in_cents +
                ", limited_time_offer_ends_on='" + limited_time_offer_ends_on + '\'' +
                ", bonus_reward_miles=" + bonus_reward_miles +
                ", bonus_reward_miles_ends_on='" + bonus_reward_miles_ends_on + '\'' +
                ", stock_type='" + stock_type + '\'' +
                ", primary_category='" + primary_category + '\'' +
                ", secondary_category='" + secondary_category + '\'' +
                ", origin='" + origin + '\'' +
                ", package_unit_type='" + package_unit_type + '\'' +
                ", package_unit_volume_in_milliliters=" + package_unit_volume_in_milliliters +
                ", total_package_units=" + total_package_units +
                ", volume_in_milliliters=" + volume_in_milliliters +
                ", alcohol_content=" + alcohol_content +
                ", price_per_liter_of_alcohol_in_cents=" + price_per_liter_of_alcohol_in_cents +
                ", price_per_liter_in_cents=" + price_per_liter_in_cents +
                ", inventory_count=" + inventory_count +
                ", inventory_volume_in_milliliters=" + inventory_volume_in_milliliters +
                ", inventory_price_in_cents=" + inventory_price_in_cents +
                ", sugar_content='" + sugar_content + '\'' +
                ", producer_name='" + producer_name + '\'' +
                ", released_on='" + released_on + '\'' +
                ", has_value_added_promotion=" + has_value_added_promotion +
                ", has_limited_time_offer=" + has_limited_time_offer +
                ", has_bonus_reward_miles=" + has_bonus_reward_miles +
                ", is_seasonal=" + is_seasonal +
                ", is_vqa=" + is_vqa +
                ", is_ocb=" + is_ocb +
                ", is_kosher=" + is_kosher +
                ", value_added_promotion_description='" + value_added_promotion_description + '\'' +
                ", description='" + description + '\'' +
                ", serving_suggestion='" + serving_suggestion + '\'' +
                ", tasting_note='" + tasting_note + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", image_thumb_url='" + image_thumb_url + '\'' +
                ", image_url='" + image_url + '\'' +
                ", varietal='" + varietal + '\'' +
                ", style='" + style + '\'' +
                ", tertiary_category='" + tertiary_category + '\'' +
                ", sugar_in_grams_per_liter=" + sugar_in_grams_per_liter +
                ", clearance_sale_savings_in_cents=" + clearance_sale_savings_in_cents +
                ", has_clearance_sale=" + has_clearance_sale +
                ", product_no=" + product_no +
                '}';
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

    public Boolean getIs_discontinued() {
        return is_discontinued;
    }

    public void setIs_discontinued(Boolean is_discontinued) {
        this.is_discontinued = is_discontinued;
    }

    public Integer getPrice_in_cents() {
        return price_in_cents;
    }

    public void setPrice_in_cents(Integer price_in_cents) {
        this.price_in_cents = price_in_cents;
    }

    public Integer getRegular_price_in_cents() {
        return regular_price_in_cents;
    }

    public void setRegular_price_in_cents(Integer regular_price_in_cents) {
        this.regular_price_in_cents = regular_price_in_cents;
    }

    public Integer getLimited_time_offer_savings_in_cents() {
        return limited_time_offer_savings_in_cents;
    }

    public void setLimited_time_offer_savings_in_cents(Integer limited_time_offer_savings_in_cents) {
        this.limited_time_offer_savings_in_cents = limited_time_offer_savings_in_cents;
    }

    public String getLimited_time_offer_ends_on() {
        return limited_time_offer_ends_on;
    }

    public void setLimited_time_offer_ends_on(String limited_time_offer_ends_on) {
        this.limited_time_offer_ends_on = limited_time_offer_ends_on;
    }

    public Integer getBonus_reward_miles() {
        return bonus_reward_miles;
    }

    public void setBonus_reward_miles(Integer bonus_reward_miles) {
        this.bonus_reward_miles = bonus_reward_miles;
    }

    public String getBonus_reward_miles_ends_on() {
        return bonus_reward_miles_ends_on;
    }

    public void setBonus_reward_miles_ends_on(String bonus_reward_miles_ends_on) {
        this.bonus_reward_miles_ends_on = bonus_reward_miles_ends_on;
    }

    public String getStock_type() {
        return stock_type;
    }

    public void setStock_type(String stock_type) {
        this.stock_type = stock_type;
    }

    public String getPrimary_category() {
        return primary_category;
    }

    public void setPrimary_category(String primary_category) {
        this.primary_category = primary_category;
    }

    public String getSecondary_category() {
        return secondary_category;
    }

    public void setSecondary_category(String secondary_category) {
        this.secondary_category = secondary_category;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPackage_unit_type() {
        return package_unit_type;
    }

    public void setPackage_unit_type(String package_unit_type) {
        this.package_unit_type = package_unit_type;
    }

    public Integer getPackage_unit_volume_in_milliliters() {
        return package_unit_volume_in_milliliters;
    }

    public void setPackage_unit_volume_in_milliliters(Integer package_unit_volume_in_milliliters) {
        this.package_unit_volume_in_milliliters = package_unit_volume_in_milliliters;
    }

    public Integer getTotal_package_units() {
        return total_package_units;
    }

    public void setTotal_package_units(Integer total_package_units) {
        this.total_package_units = total_package_units;
    }

    public Integer getVolume_in_milliliters() {
        return volume_in_milliliters;
    }

    public void setVolume_in_milliliters(Integer volume_in_milliliters) {
        this.volume_in_milliliters = volume_in_milliliters;
    }

    public Integer getAlcohol_content() {
        return alcohol_content;
    }

    public void setAlcohol_content(Integer alcohol_content) {
        this.alcohol_content = alcohol_content;
    }

    public Integer getPrice_per_liter_of_alcohol_in_cents() {
        return price_per_liter_of_alcohol_in_cents;
    }

    public void setPrice_per_liter_of_alcohol_in_cents(Integer price_per_liter_of_alcohol_in_cents) {
        this.price_per_liter_of_alcohol_in_cents = price_per_liter_of_alcohol_in_cents;
    }

    public Integer getPrice_per_liter_in_cents() {
        return price_per_liter_in_cents;
    }

    public void setPrice_per_liter_in_cents(Integer price_per_liter_in_cents) {
        this.price_per_liter_in_cents = price_per_liter_in_cents;
    }

    public Integer getInventory_count() {
        return inventory_count;
    }

    public void setInventory_count(Integer inventory_count) {
        this.inventory_count = inventory_count;
    }

    public Integer getInventory_volume_in_milliliters() {
        return inventory_volume_in_milliliters;
    }

    public void setInventory_volume_in_milliliters(Integer inventory_volume_in_milliliters) {
        this.inventory_volume_in_milliliters = inventory_volume_in_milliliters;
    }

    public Integer getInventory_price_in_cents() {
        return inventory_price_in_cents;
    }

    public void setInventory_price_in_cents(Integer inventory_price_in_cents) {
        this.inventory_price_in_cents = inventory_price_in_cents;
    }

    public String getSugar_content() {
        return sugar_content;
    }

    public void setSugar_content(String sugar_content) {
        this.sugar_content = sugar_content;
    }

    public String getProducer_name() {
        return producer_name;
    }

    public void setProducer_name(String producer_name) {
        this.producer_name = producer_name;
    }

    public String getReleased_on() {
        return released_on;
    }

    public void setReleased_on(String released_on) {
        this.released_on = released_on;
    }

    public Boolean getHas_value_added_promotion() {
        return has_value_added_promotion;
    }

    public void setHas_value_added_promotion(Boolean has_value_added_promotion) {
        this.has_value_added_promotion = has_value_added_promotion;
    }

    public Boolean getHas_limited_time_offer() {
        return has_limited_time_offer;
    }

    public void setHas_limited_time_offer(Boolean has_limited_time_offer) {
        this.has_limited_time_offer = has_limited_time_offer;
    }

    public Boolean getHas_bonus_reward_miles() {
        return has_bonus_reward_miles;
    }

    public void setHas_bonus_reward_miles(Boolean has_bonus_reward_miles) {
        this.has_bonus_reward_miles = has_bonus_reward_miles;
    }

    public Boolean getIs_seasonal() {
        return is_seasonal;
    }

    public void setIs_seasonal(Boolean is_seasonal) {
        this.is_seasonal = is_seasonal;
    }

    public Boolean getIs_vqa() {
        return is_vqa;
    }

    public void setIs_vqa(Boolean is_vqa) {
        this.is_vqa = is_vqa;
    }

    public Boolean getIs_ocb() {
        return is_ocb;
    }

    public void setIs_ocb(Boolean is_ocb) {
        this.is_ocb = is_ocb;
    }

    public Boolean getIs_kosher() {
        return is_kosher;
    }

    public void setIs_kosher(Boolean is_kosher) {
        this.is_kosher = is_kosher;
    }

    public String getValue_added_promotion_description() {
        return value_added_promotion_description;
    }

    public void setValue_added_promotion_description(String value_added_promotion_description) {
        this.value_added_promotion_description = value_added_promotion_description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServing_suggestion() {
        return serving_suggestion;
    }

    public void setServing_suggestion(String serving_suggestion) {
        this.serving_suggestion = serving_suggestion;
    }

    public String getTasting_note() {
        return tasting_note;
    }

    public void setTasting_note(String tasting_note) {
        this.tasting_note = tasting_note;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getImage_thumb_url() {
        return image_thumb_url;
    }

    public void setImage_thumb_url(String image_thumb_url) {
        this.image_thumb_url = image_thumb_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getVarietal() {
        return varietal;
    }

    public void setVarietal(String varietal) {
        this.varietal = varietal;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getTertiary_category() {
        return tertiary_category;
    }

    public void setTertiary_category(String tertiary_category) {
        this.tertiary_category = tertiary_category;
    }

    public Integer getSugar_in_grams_per_liter() {
        return sugar_in_grams_per_liter;
    }

    public void setSugar_in_grams_per_liter(Integer sugar_in_grams_per_liter) {
        this.sugar_in_grams_per_liter = sugar_in_grams_per_liter;
    }

    public Integer getClearance_sale_savings_in_cents() {
        return clearance_sale_savings_in_cents;
    }

    public void setClearance_sale_savings_in_cents(Integer clearance_sale_savings_in_cents) {
        this.clearance_sale_savings_in_cents = clearance_sale_savings_in_cents;
    }

    public Boolean getHas_clearance_sale() {
        return has_clearance_sale;
    }

    public void setHas_clearance_sale(Boolean has_clearance_sale) {
        this.has_clearance_sale = has_clearance_sale;
    }

    public Integer getProduct_no() {
        return product_no;
    }

    public void setProduct_no(Integer product_no) {
        this.product_no = product_no;
    }
}
