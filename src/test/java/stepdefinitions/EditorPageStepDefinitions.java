package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.EditorPage;

public class EditorPageStepDefinitions {


    EditorPage editorPage = new EditorPage();


    @Then("user clicks on new button")
    public void user_clicks_on_new_button() {
        editorPage.editorHomePageNewButton.click();
    }
    @Then("user enters {string} to firstname box")
    public void user_enters_to_firstname_box(String firstname) {
        editorPage.firstNameTextBox.sendKeys(firstname);
    }
    @Then("user enters {string} to lastname box")
    public void user_enters_to_lastname_box(String lastname) {
        editorPage.lastNameTextBox.sendKeys(lastname);
    }
    @Then("user enters {string} to position box")
    public void user_enters_to_position_box(String position) {
       editorPage.positionTextBox.sendKeys(position);
    }
    @Then("user enters {string} to office box")
    public void user_enters_to_office_box(String office) {
        editorPage.officeTextBox.sendKeys(office);
    }
    @Then("user enters {string} to extensions box")
    public void user_enters_to_extensions_box(String extn) {
       editorPage.extensionTextBox.sendKeys(extn);
    }
    @Then("user enters {string} to start date box")
    public void user_enters_to_start_date_box(String date) {
        editorPage.startDateTextBox.sendKeys(date);
    }
    @Then("user enters {string} to salary box")
    public void user_enters_to_salary_box(String salary) {
        editorPage.salaryTextBox.sendKeys(salary);
    }
    @Then("user clicks on craete button")
    public void user_clicks_on_craete_button() {
       editorPage.createButton.click();
    }
    @Then("user sends the {string} to search box")
    public void user_sends_the_to_search_box(String firstname) {
        editorPage.searchBox.sendKeys(firstname);
    }
    @Then("user tests that user's {string} is in the list")
    public void user_tests_that_user_s_is_in_the_list(String firstname) {
        String actualData = editorPage.tableFirstNameElement.getText();
        String expecteData = firstname;

        Assert.assertTrue(actualData.contains(expecteData));
    }
}
