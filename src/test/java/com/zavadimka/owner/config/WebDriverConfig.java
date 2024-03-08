package com.zavadimka.owner.config;

public class WebDriverConfig {

    public String getBaserUrl (){
        String baseUrl = System.getProperty("baseUrl", "https://github.com/");

        return baseUrl;
    }

    public Browser getBrowser(){
        String browser = System.getProperty("browser", "CHROME");

        return Browser.valueOf(browser);
    }
}
