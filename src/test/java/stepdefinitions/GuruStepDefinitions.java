package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.GuruPage;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guruPage = new GuruPage();

    @Given("{string} prints all the values in its column")
    public void prints_all_the_values_in_its_column(String string) {

        List<WebElement> listOfCompanies = guruPage.companyElementsList;
        for (WebElement each: listOfCompanies) {
            System.out.println(each.getText());
        }

    }
    @Then("test that {string} lists {string}")
    public void test_that_lists(String string, String desiredCompanyName) {
        List<WebElement> listOfCompanies = guruPage.companyElementsList;

        int flag = 0;
        for (WebElement each: listOfCompanies) {
            if(each.getText().equals(desiredCompanyName)){
                flag =1;
                System.out.println("list hase the "+desiredCompanyName);
            }
        }

        Assert.assertTrue(flag ==1);

    }

}
