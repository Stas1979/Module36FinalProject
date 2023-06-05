package ru.Skillfactory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {

    public WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
    }

    private static By dataScience = By.cssSelector("#rec562561178 > div > div > div.t396__elem.tn-elem.tn-elem__5625611781679404657898.js-sbs-anim-trigger_hover > a");
    private static By dataAnalyst = By.cssSelector("#rec562561178 > div > div > div.t396__elem.tn-elem.tn-elem__5625611781679404895615.js-sbs-anim-trigger_hover");
    private static By testing = By.cssSelector("#rec562561178 > div > div > div.t396__elem.tn-elem.tn-elem__5625611781679405234205.js-sbs-anim-trigger_hover > a");
    private static By higherEducation = By.cssSelector("#rec562561178 > div > div > div.t396__elem.tn-elem.tn-elem__5625611781679405356847.js-sbs-anim-trigger_hover > a");
    private static By onlineCourses = By.cssSelector("#sbs-562561178-1678713806317 > div > a");
    private static By forFree = By.cssSelector("#sbs-562561178-1678713806343 > div > a");
    private static By careerCenter = By.cssSelector("#sbs-562561178-1678713806322 > div > a");
    private static By contacts = By.cssSelector("#sbs-562561178-1678713806326 > div > a");
    private static By media = By.cssSelector("#sbs-562561178-1678713806329 > div > a");
    private static By corporateTraining = By.cssSelector("#sbs-562561178-1678713806333 > div > a");


    public void startOpen1() {
        driver.get("https://skillfactory.ru/#submenu:details");
    }

    public void startClick() {
        driver.findElement(dataScience).click();
        //Data Science
    }

    public void startClick1() {
        driver.findElement(dataAnalyst).click();
        //Аналитик данных
    }

    public void startClick2() {
        driver.findElement(testing).click();
        //Тестирование
    }

    public void startClick3() {
        driver.findElement(higherEducation).click();
        //Высшее образование
    }

    public void headerClick() {
        driver.findElement(onlineCourses).click();
        //Онлайн-курсы

    }

    public void headerClick1() {
        driver.findElement(forFree).click();
        //Бесплатно

    }

    public void headerClick2() {
        driver.findElement(careerCenter).click();
        //Центр карьеры

    }

    public void headerClick3() {
        driver.findElement(contacts).click();
        //Контакты

    }

    public void headerClick4() {
        driver.findElement(media).click();
        //Медиа

    }

    public void headerClick5() {
        driver.findElement(corporateTraining).click();
        //Корпоративное обучение
    }

}
