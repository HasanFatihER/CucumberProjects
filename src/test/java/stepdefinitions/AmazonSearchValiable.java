package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonHomePage;


public class AmazonSearchValiable {
    AmazonHomePage amazonHomePage=new AmazonHomePage();
    @Given("{string} icin arama yapar")
    public void icin_arama_yapar(String searchValue) {
       amazonHomePage.amazonSearchBox.sendKeys(searchValue+ Keys.ENTER);
    }
    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String searchResult) {
        Assert.assertTrue(amazonHomePage.amazonSearchResult.getText().contains(searchResult));

    }

}
