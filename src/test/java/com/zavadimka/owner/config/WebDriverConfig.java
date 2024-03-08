package com.zavadimka.owner.config;

public class WebDriverConfig {

    public String getBaserUrl (){
       return "https://github.com/";
    }

    public Browser getBrowser(){
        return Browser.CHROME;
    }
}
