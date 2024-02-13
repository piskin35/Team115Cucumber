package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import pages.EditorPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    /*
    sometimes we may need to create an object in all the methods it is used
     */

    AmazonPage amazonPage = new AmazonPage();


    @Given("user goes to amazon homepage")
    public void user_goes_to_amazon_homepage() {

        Driver.getDriver().get("https://www.amazon.com/");
    }

    @Then("user searches for Nutella in search box")
    public void user_searches_for_nutella_in_search_box() {
        amazonPage = new AmazonPage();

        amazonPage.amazonSearchBox.sendKeys("Nutella" + Keys.ENTER);

    }

    @Then("tests that result text contains Nutella word")
    public void tests_that_result_text_contains_nutella_word() {
        amazonPage = new AmazonPage();
        String expectedWord = "Nutella";
        String actualResultText =amazonPage.amazonResultTextBox.getText();


        Assert.assertTrue(actualResultText.contains(expectedWord));

    }

    @Then("closes the page")
    public void closes_the_page() {

        Driver.closeDriver();

    }


    @Then("user searches for TeaPot in search box")
    public void userSearchesForTeaPotInSearchBox() {

        amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("TeaPot" + Keys.ENTER);
    }

    @And("tests that result text contains TeaPot word")
    public void testsThatResultTextContainsTeaPotWord() {

        amazonPage = new AmazonPage();
        String actualText = amazonPage.amazonResultTextBox.getText();
        String expected = "TeaPot";

        Assert.assertTrue(actualText.contains(expected));
    }

    @Then("user searches for flower in search box")
    public void userSearchesForFlowerInSearchBox() {
        amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("flower" + Keys.ENTER);
    }

    @And("tests that result text contains Flower word")
    public void testsThatResultTextContainsFlowerWord() {
        amazonPage = new AmazonPage();
        String actualText = amazonPage.amazonResultTextBox.getText();
        String expected = "flower";

        Assert.assertTrue(actualText.contains(expected));
    }

    @Then("user searches for {string} in search box")
    public void userSearchesForInSearchBox(String word) {

        amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys(word + Keys.ENTER);
    }


    @And("tests that result text contains {string} word")
    public void testsThatResultTextContainsWord(String word) {
        amazonPage = new AmazonPage();
        String actualText = amazonPage.amazonResultTextBox.getText();
        String expected = word;

        Assert.assertTrue(actualText.contains(expected));
    }

    @Given("user goes to {string} homepage")
    public void userGoesToHomepage(String desiredUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(desiredUrl));
    }

    @Then("tests that url has {string} word")
    public void testsThatUrlHasWord(String urlWord) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedWord = urlWord;

        Assert.assertTrue(actualUrl.contains(expectedWord));
    }
}