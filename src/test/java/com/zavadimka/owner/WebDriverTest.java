package com.zavadimka.owner;

import com.zavadimka.owner.config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    // подготовка драйвера
    private WebDriver driver;
//    private NewTool newTool;


    public void startWebDriver (){
        driver = new WebDriverProvider().get();
//        newTool = new NewToolProvider().get();
    }

    @Test
    public void testGithub() {

        startWebDriver();

        // тело теста
        String title = driver.getTitle();
        assertEquals(title, "GitHub: Let’s build from here · GitHub");

    }

    @AfterEach
    public void stopWebDriver(){

        driver.quit();
    }
}
