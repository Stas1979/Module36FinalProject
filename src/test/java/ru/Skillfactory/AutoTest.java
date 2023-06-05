package FinalProject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;


public class AutoTest extends WebDriverSettings {

    // Стартовая страница: проверка перехода по кнопки
    @Test
    public void testClick8() {
        StartPage StartPage = PageFactory.initElements(driver, StartPage.class);
        StartPage.startOpen1();

        StartPage.startClick();

    }

    @Test
    public void testClick9() {
        StartPage StartPage = PageFactory.initElements(driver, StartPage.class);
        StartPage.startOpen1();

        StartPage.startClick();

    }

}