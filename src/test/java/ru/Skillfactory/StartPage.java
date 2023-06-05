package FinalProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {

    public WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
    }

    private static By dataScience = By.cssSelector("#rec562561178 > div > div > div.t396__elem.tn-elem.tn-elem__5625611781679404657898.js-sbs-anim-trigger_hover > a");
    private static By dataAnalyst = By.cssSelector("#rec562561178 > div > div > div.t396__elem.tn-elem.tn-elem__5625611781679404895615.js-sbs-anim-trigger_hover > a");
    private static By testing = By.cssSelector("#rec562561178 > div > div > div.t396__elem.tn-elem.tn-elem__5625611781679405234205.js-sbs-anim-trigger_hover > a");
    private static By higherEducation = By.cssSelector("#rec562561178 > div > div > div.t396__elem.tn-elem.tn-elem__5625611781679405356847.js-sbs-anim-trigger_hover > a");

    public void startOpen1() {
        driver.get("https://skillfactory.ru/#submenu:details");

    }

    public void startClick() {

        Boolean visibleState = driver.findElement(dataScience).isDisplayed();
        System.out.println("The Submit Button visibility is: " + visibleState);

        if (visibleState) {
            Boolean status = driver.findElement(dataScience).isEnabled();
            System.out.println("The status of Submit Button is: " + status);

            if (status) {
                driver.findElement(dataScience).click();
                //Data Science
            }

        }
    }
}