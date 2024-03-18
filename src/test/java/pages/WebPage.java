package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;

import static helper.Utility.driver;

public class WebPage {

    By input_username = By.id("user-name");
    By input_password = By.id("password");
    By btn_login = By.id("login-button");
    By icon_cart = By.xpath("//a[@class='shopping_cart_link']");
    By text_error_Message(String msg){
        return By.xpath("//*[contains(text (), '" + msg + "')]");
    }

    By add_To_Cart = By.xpath("(//*[text()='Add to cart'])[1]");

    By remove_To_Cart = By.xpath("(//*[text()='Remove'])[1]");
    By icon_cart_item = By.xpath("//span[@class='shopping_cart_badge']");




    public void openBrowser(){
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username){
        driver.findElement(input_username).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(input_password).sendKeys(password);
    }

    public void loginButton(){
        driver.findElement(btn_login).click();
    }

    public void assertHomePage(){
        driver.findElement(icon_cart).isDisplayed();
    }

    public void assertErrorMessage(String errmsg){
        driver.findElement(text_error_Message(errmsg)).isDisplayed();
    }

    public void clickAddToCart(){
        driver.findElement(add_To_Cart).click();
    }

    public void assertCartItem(String cartItem){
        String itemExpected = cartItem;
        String itemActual = driver.findElement(icon_cart_item).getText();

        Assertions.assertThat(itemActual).isEqualTo(itemExpected);

    }
    public void removeToCart(){
        driver.findElement(remove_To_Cart).click();
    }
}
