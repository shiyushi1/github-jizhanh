package com.kgc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Bills {
    private Long id;

    private String title;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date btime;

    private Integer typeid;

    private Long price;

    private String bexplain;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getBexplain() {
        return bexplain;
    }

    public void setBexplain(String bexplain) {
        this.bexplain = bexplain == null ? null : bexplain.trim();
    }
}