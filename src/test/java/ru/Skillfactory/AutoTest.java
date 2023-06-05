package ru.Skillfactory;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;


public class AutoTest extends WebDriverSettings {

    // Стартовая страница: проверка перехода по кнопки


    @Test

    public void dataScience() {
        StartPage StartPage = PageFactory.initElements(driver, StartPage.class);
        StartPage.startOpen1();

        StartPage.startClick();
    }

    @Test

    public void dataAnalyst() {
        StartPage StartPage = PageFactory.initElements(driver, StartPage.class);
        StartPage.startOpen1();

        StartPage.startClick1();
    }

    @Test

    public void testing() {
        StartPage StartPage = PageFactory.initElements(driver, StartPage.class);
        StartPage.startOpen1();

        StartPage.startClick2();
    }

    @Test

    public void higherEducation() {
        StartPage StartPage = PageFactory.initElements(driver, StartPage.class);
        StartPage.startOpen1();

        StartPage.startClick3();
    }


    @Test

    public void onlineCourses() {
        StartPage StartPage = PageFactory.initElements(driver, StartPage.class);
        StartPage.startOpen1();

        StartPage.headerClick();
    }

    @Test
    public void forFree() {
        StartPage StartPage = PageFactory.initElements(driver, StartPage.class);
        StartPage.startOpen1();

        StartPage.headerClick1();
    }

    @Test
    public void careerCenter() {
        StartPage StartPage = PageFactory.initElements(driver, StartPage.class);
        StartPage.startOpen1();

        StartPage.headerClick2();
    }

    @Test

    public void contacts() {
        StartPage StartPage = PageFactory.initElements(driver, StartPage.class);
        StartPage.startOpen1();

        StartPage.headerClick3();
    }

    @Test
    public void media() {
        StartPage StartPage = PageFactory.initElements(driver, StartPage.class);
        StartPage.startOpen1();

        StartPage.headerClick4();
    }

    @Test
    public void corporateTraining() {
        StartPage StartPage = PageFactory.initElements(driver, StartPage.class);
        StartPage.startOpen1();

        StartPage.headerClick5();
    }


}
