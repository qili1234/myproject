package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Stain {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8085/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
   //tmp2 change
  @Test
  public void testStain() throws Exception {
    driver.get(baseUrl + "/cahubdataservices/caseRecord/view/9443");
    driver.findElement(By.linkText("(Start)")).click();
    driver.findElement(By.id("slidePrepTech")).clear();
    driver.findElement(By.id("slidePrepTech")).sendKeys("fdfd");
    driver.findElement(By.id("addSlideBtn")).click();
    driver.findElement(By.id("newslideId")).clear();
    driver.findElement(By.id("newslideId")).sendKeys("BPV-00941-50");
    new Select(driver.findElement(By.id("newmodule"))).selectByVisibleText("Module I");
    driver.findElement(By.id("saveBtn")).click();
    driver.findElement(By.id("addSlideBtn")).click();
    driver.findElement(By.id("newslideId")).clear();
    driver.findElement(By.id("newslideId")).sendKeys("BPV-00941-51");
    new Select(driver.findElement(By.id("newmodule"))).selectByVisibleText("Module I");
    driver.findElement(By.id("saveBtn")).click();
    driver.findElement(By.id("addSlideBtn")).click();
    driver.findElement(By.id("newslideId")).clear();
    driver.findElement(By.id("newslideId")).sendKeys("BPV-00941-52");
    new Select(driver.findElement(By.id("newmodule"))).selectByVisibleText("Module V");
    driver.findElement(By.cssSelector("option[value=\"61\"]")).click();
    driver.findElement(By.id("saveBtn")).click();
    driver.findElement(By.id("addSlideBtn")).click();
    driver.findElement(By.id("newslideId")).clear();
    driver.findElement(By.id("newslideId")).sendKeys("BPV-00941-53");
    new Select(driver.findElement(By.id("newmodule"))).selectByVisibleText("Module V");
    driver.findElement(By.id("saveBtn")).click();
    driver.findElement(By.id("siteSOPSlidePrep")).clear();
    driver.findElement(By.id("siteSOPSlidePrep")).sendKeys("sop1");
    new Select(driver.findElement(By.id("microtome"))).selectByVisibleText("Microm Ergostar HM200");
    driver.findElement(By.cssSelector("option[value=\"Microm Ergostar HM200\"]")).click();
    new Select(driver.findElement(By.id("microtomeBladeType"))).selectByVisibleText("Low profile Sakura Accu-Edge");
    driver.findElement(By.cssSelector("option[value=\"Low profile Sakura Accu-Edge\"]")).click();
    new Select(driver.findElement(By.id("microtomeBladeAge"))).selectByVisibleText("Fresh");
    driver.findElement(By.cssSelector("option[value=\"Fresh\"]")).click();
    new Select(driver.findElement(By.id("facedBlockPrep"))).selectByVisibleText("20 Minutes on ice");
    driver.findElement(By.cssSelector("option[value=\"20 Minutes on ice\"]")).click();
    new Select(driver.findElement(By.id("sectionThickness"))).selectByVisibleText("4-5 micrometers");
    driver.findElement(By.cssSelector("option[value=\"4-5 micrometers\"]")).click();
    new Select(driver.findElement(By.id("slideCharge"))).selectByVisibleText("Charged");
    driver.findElement(By.cssSelector("option[value=\"Charged\"]")).click();
    driver.findElement(By.id("waterBathTemp")).click();
    new Select(driver.findElement(By.id("waterBathTemp"))).selectByVisibleText("43 (+/-2)°C");
    driver.findElement(By.cssSelector("option[value=\"43 (+/-2)°C\"]")).click();
    new Select(driver.findElement(By.id("microtomeDailyMaint"))).selectByVisibleText("Daily");
    driver.findElement(By.cssSelector("option[value=\"Daily\"]")).click();
    new Select(driver.findElement(By.id("waterbathMaint"))).selectByVisibleText("Daily");
    driver.findElement(By.cssSelector("#waterbathMaint > option[value=\"Daily\"]")).click();
    driver.findElement(By.id("siteSOPHEStain")).clear();
    driver.findElement(By.id("siteSOPHEStain")).sendKeys("sop2");
    new Select(driver.findElement(By.id("heTimeInOven"))).selectByVisibleText("20 minutes");
    driver.findElement(By.cssSelector("option[value=\"20 minutes\"]")).click();
    new Select(driver.findElement(By.id("heOvenTemp"))).selectByVisibleText("60° C");
    driver.findElement(By.cssSelector("option[value=\"60° C\"]")).click();
    new Select(driver.findElement(By.id("heDeParrafinMethod"))).selectByVisibleText("Automated stainer");
    driver.findElement(By.cssSelector("option[value=\"Automated stainer\"]")).click();
    new Select(driver.findElement(By.id("heStainMethod"))).selectByVisibleText("Automated stainer");
    driver.findElement(By.cssSelector("#heStainMethod > option[value=\"Automated stainer\"]")).click();
    new Select(driver.findElement(By.id("heClearingMethod"))).selectByVisibleText("Automated stainer");
    driver.findElement(By.cssSelector("#heClearingMethod > option[value=\"Automated stainer\"]")).click();
    new Select(driver.findElement(By.id("heCoverSlipping"))).selectByVisibleText("Manual");
    new Select(driver.findElement(By.id("heEquipMaint"))).selectByVisibleText("Daily, Weekly, Bi-Monthly, Per SOP");
    driver.findElement(By.id("create")).click();
    driver.findElement(By.name("_action_submit")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
