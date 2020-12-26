package com.example.kuouapplication.db;


import org.litepal.crud.LitePalSupport;

/**
 * Created by php on 2020/12/24.
 */

public class County extends LitePalSupport {
    private int id;
    private String conutyName;
    private String weatherId;
    private  int cityId;
    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getConutyName() {
        return conutyName;
    }

    public void setConutyName(String conutryName) {
        this.conutyName = conutryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
