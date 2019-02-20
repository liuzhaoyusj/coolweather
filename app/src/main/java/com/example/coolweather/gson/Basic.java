package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import interfaces.heweather.com.interfacesmodule.bean.basic.Update;

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
