package AppiumTest.stepdefinitions;

import AppiumTest.page.Wifipage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WififStepDefinitions {
  Wifipage wifipage=new Wifipage();


  @Given("navigate to apidemos and click preferences")
  public void navigate_to_apidemos_and_click_preferences() throws InterruptedException {

  wifipage.preference.click();
      Thread.sleep(5000);

  }

  @Then("click preference dependencies")
  public void click_preference_dependencies() {
  wifipage.prefen3.click();
  }

  @Then("activate wifi check box")
  public void activate_wifi_check_box() {
  wifipage.checkBox.click();
  }

  @Then("click wifi settings")
  public void click_wifi_settings() {
 wifipage.wifiSettings.click();
  }

  @Then("write holder {string} and click ok")
  public void write_holder_and_click_ok(String endText) throws InterruptedException {

    wifipage.editText.sendKeys(endText);
    Thread.sleep(3000);
    wifipage.okButton.click();
  }

  @Then("verify written text in the holder")
  public void verifyWrittenTextInTheHolder() {
    System.out.println("wifipage.wifiSettings.getText() = " + wifipage.wifiSettings.getText());
  }
}
