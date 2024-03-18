package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WebPage;

public class webStepDef {

    WebPage webPage;

    public webStepDef(){
        this.webPage = new WebPage();
    }


    @Given("open web login page")
    public void openWebLoginPage() {
        webPage.openBrowser();

    }

    @And("user input username {string}")
    public void userInputUsername(String username) {
        webPage.inputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        webPage.inputPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        webPage.loginButton();
    }

    @Then("user will see icon cart in homepage")
    public void userWillSeeIconCartInHomepage() {
        webPage.assertHomePage();
    }

    @Then("user will see error message {string}")
    public void userWillSeeErrorMessage(String errmsg) {
        webPage.assertErrorMessage(errmsg);
    }

    @And("user add item to cart")
    public void userAddItemToCart() {
        webPage.clickAddToCart();
    }

    @Then("verify cart item is match {string}")
    public void verifyCartItemIsMatch(String cartItem) {
        webPage.assertCartItem(cartItem);
    }

    @And("user remove item to cart")
    public void userRemoveItemToCart() {
        webPage.removeToCart();
    }
}
