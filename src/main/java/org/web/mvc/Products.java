/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.web.mvc;

import java.util.Date;

/**
 *
 * @author yorlysoropeza <yorlysoro@gmail.com>
 */
public class Products {
    private Integer id;
    private String name;
    private String code;
    private Double price;
    private Date date;
    private String section;
    private Boolean isImported;
    private String country;

    public Products(String name, Double price, Date date, String section, Boolean isImported, String country) {
        this.name = name;
        this.price = price;
        this.date = date;
        this.section = section;
        this.isImported = isImported;
        this.country = country;
    }    
    
    public Products(Integer id, String name, String code, Double price, Date date, String section, Boolean isImported, String country) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.price = price;
        this.date = date;
        this.section = section;
        this.isImported = isImported;
        this.country = country;
    }

    public Products(String name, String code, Double price, Date date, String section, Boolean isImported, String country) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.date = date;
        this.section = section;
        this.isImported = isImported;
        this.country = country;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Boolean getIsImported() {
        return isImported;
    }

    public void setIsImported(Boolean isImported) {
        this.isImported = isImported;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Products{" + "id=" + id + ", name=" + name + ", code=" + code + ", price=" + price + ", date=" + date + ", section=" + section + ", isImported=" + isImported + ", country=" + country + '}';
    }
    
    
}
