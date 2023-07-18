package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    /*
    sometimes we may need to create an object in all the methods it is used
     */

    AmazonPage amazonPage = new AmazonPage();


    @Given("user goes to amazon homepage")
    public void user_goes_to_amazon_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("user searchs for Nutella in search box")
    public void user_searchs_for_nutella_in_search_box() {
        amazonPage = new AmazonPage();


        amazonPage.amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);
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


}