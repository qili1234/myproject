package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Worksheet {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

 //b1 change....
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8085/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testWorksheet() throws Exception {
    driver.get(baseUrl + "/cahubdataservices/caseRecord/view/9427");
    driver.findElement(By.linkText("(Start)")).click();
    driver.findElement(By.id("experimentId_2401")).clear();
    driver.findElement(By.id("experimentId_2401")).sendKeys("key938");
    driver.findElement(By.id("m1")).click();
    driver.findElement(By.id("m5")).click();
    driver.findElement(By.id("nat")).click();
    driver.findElement(By.name("_action_update")).click();
    driver.findElement(By.id("2401")).click();
    driver.findElement(By.id("p1")).click();
    driver.findElement(By.xpath("//div[@id='container']/form/div/table/tbody/tr[2]/td[2]/input")).clear();
    driver.findElement(By.xpath("//div[@id='container']/form/div/table/tbody/tr[2]/td[2]/input")).sendKeys("BPV-00938-20");
    driver.findElement(By.id("sampleFrWeight")).clear();
    driver.findElement(By.id("sampleFrWeight")).sendKeys("20");
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[3]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[3]/input")).sendKeys("BPV-00938-01");
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[5]/input")).click();
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[5]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[5]/input")).sendKeys("BPV-00938-01");
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[2]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[2]/input")).sendKeys("BPV-00938-01");
    driver.findElement(By.xpath("(//tr[@id='protocol_qc']/td[6]/input)[2]")).clear();
    driver.findElement(By.xpath("(//tr[@id='protocol_qc']/td[6]/input)[2]")).sendKeys("BPV-00938-01");
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[8]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[8]/input")).sendKeys("BPV-00938-01");
    driver.findElement(By.xpath("//tr[@id='protocol_a']/td[3]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_a']/td[3]/input")).sendKeys("BPV-00938-02");
    driver.findElement(By.xpath("//tr[@id='protocol_a']/td[5]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_a']/td[5]/input")).sendKeys("BPV-00938-02");
    driver.findElement(By.xpath("//tr[@id='protocol_a']/td[2]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_a']/td[2]/input")).sendKeys("BPV-00938-02");
    driver.findElement(By.xpath("(//tr[@id='protocol_a']/td[3]/input)[2]")).click();
    driver.findElement(By.xpath("(//tr[@id='protocol_a']/td[6]/input)[2]")).click();
    driver.findElement(By.xpath("(//tr[@id='protocol_a']/td[6]/input)[2]")).clear();
    driver.findElement(By.xpath("(//tr[@id='protocol_a']/td[6]/input)[2]")).sendKeys("BPV-00938-02");
    driver.findElement(By.xpath("//tr[@id='protocol_a']/td[8]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_a']/td[8]/input")).sendKeys("BPV-00938-02");
    driver.findElement(By.xpath("//tr[@id='protocol_b']/td[3]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_b']/td[3]/input")).sendKeys("BPV-00938-03");
    driver.findElement(By.xpath("//tr[@id='protocol_b']/td[5]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_b']/td[5]/input")).sendKeys("BPV-00938-03");
    driver.findElement(By.xpath("//tr[@id='protocol_b']/td[2]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_b']/td[2]/input")).sendKeys("BPV-00938-03");
    driver.findElement(By.xpath("(//tr[@id='protocol_b']/td[6]/input)[2]")).clear();
    driver.findElement(By.xpath("(//tr[@id='protocol_b']/td[6]/input)[2]")).sendKeys("BPV-00938-03");
    driver.findElement(By.xpath("//tr[@id='protocol_b']/td[7]/input")).click();
    driver.findElement(By.xpath("//tr[@id='protocol_b']/td[8]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_b']/td[8]/input")).sendKeys("BPV-00938-03");
    driver.findElement(By.xpath("//tr[@id='protocol_c']/td[3]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_c']/td[3]/input")).sendKeys("BPV-00938-04");
    driver.findElement(By.xpath("//tr[@id='protocol_c']/td[5]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_c']/td[5]/input")).sendKeys("BPV-00938-04");
    driver.findElement(By.xpath("//tr[@id='protocol_c']/td[2]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_c']/td[2]/input")).sendKeys("BPV-00938-04");
    driver.findElement(By.xpath("(//tr[@id='protocol_c']/td[6]/input)[2]")).clear();
    driver.findElement(By.xpath("(//tr[@id='protocol_c']/td[6]/input)[2]")).sendKeys("BPV-00938-04");
    driver.findElement(By.xpath("//tr[@id='protocol_c']/td[8]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_c']/td[8]/input")).sendKeys("BPV-00938-04");
    driver.findElement(By.xpath("//tr[@id='protocol_d']/td[3]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_d']/td[3]/input")).sendKeys("BPV-00938-05");
    driver.findElement(By.xpath("//tr[@id='protocol_d']/td[5]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_d']/td[5]/input")).sendKeys("BPV-00938-05");
    driver.findElement(By.xpath("//tr[@id='protocol_d']/td[2]/input")).click();
    driver.findElement(By.xpath("//tr[@id='protocol_d']/td[2]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_d']/td[2]/input")).sendKeys("BPV-00938-05");
    driver.findElement(By.xpath("(//tr[@id='protocol_d']/td[6]/input)[2]")).clear();
    driver.findElement(By.xpath("(//tr[@id='protocol_d']/td[6]/input)[2]")).sendKeys("BPV-00938-05");
    driver.findElement(By.xpath("//tr[@id='protocol_d']/td[8]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_d']/td[8]/input")).sendKeys("BPV-00938-05");
    driver.findElement(By.xpath("(//tr[@id='protocol_qc']/td[4]/input)[2]")).clear();
    driver.findElement(By.xpath("(//tr[@id='protocol_qc']/td[4]/input)[2]")).sendKeys("02/25/2015 22:28");
    driver.findElement(By.xpath("(//tr[@id='protocol_a']/td[4]/input)[2]")).clear();
    driver.findElement(By.xpath("(//tr[@id='protocol_a']/td[4]/input)[2]")).sendKeys("02/25/2015 22:28");
    driver.findElement(By.xpath("(//tr[@id='protocol_b']/td[4]/input)[2]")).clear();
    driver.findElement(By.xpath("(//tr[@id='protocol_b']/td[4]/input)[2]")).sendKeys("02/25/2015 22:28");
    driver.findElement(By.xpath("(//tr[@id='protocol_c']/td[4]/input)[2]")).clear();
    driver.findElement(By.xpath("(//tr[@id='protocol_c']/td[4]/input)[2]")).sendKeys("02/25/2015 22:28");
    driver.findElement(By.xpath("(//tr[@id='protocol_d']/td[4]/input)[2]")).clear();
    driver.findElement(By.xpath("(//tr[@id='protocol_d']/td[4]/input)[2]")).sendKeys("02/25/2015 22:28");
    driver.findElement(By.id("sub")).click();
    driver.findElement(By.linkText("FFPE Worksheet Main")).click();
    driver.findElement(By.xpath("//span[@id='em5']/input")).click();
    driver.findElement(By.id("p2")).click();
    driver.findElement(By.xpath("//div[@id='container']/form/div/table/tbody/tr[2]/td[2]/input")).clear();
    driver.findElement(By.xpath("//div[@id='container']/form/div/table/tbody/tr[2]/td[2]/input")).sendKeys("BPV-00938-21");
    driver.findElement(By.id("sampleFrWeight")).clear();
    driver.findElement(By.id("sampleFrWeight")).sendKeys("33");
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[3]/input")).click();
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[3]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[3]/input")).sendKeys("BPV-00938-06");
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[5]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[5]/input")).sendKeys("BPV-00938-06");
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[2]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[2]/input")).sendKeys("BPV-00938-06");
    driver.findElement(By.xpath("(//tr[@id='protocol_qc']/td[6]/input)[2]")).clear();
    driver.findElement(By.xpath("(//tr[@id='protocol_qc']/td[6]/input)[2]")).sendKeys("BPV-00938-06");
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[8]/input")).clear();
    driver.findElement(By.xpath("//tr[@id='protocol_qc']/td[8]/input")).sendKeys("BPV-00938-06");
    driver.findElement(By.xpath("(//tr[@id='protocol_qc']/td[4]/input)[2]")).click();
    driver.findElement(By.xpath("(//tr[@id='protocol_qc']/td[4]/input)[2]")).clear();
    driver.findElement(By.xpath("(//tr[@id='protocol_qc']/td[4]/input)[2]")).sendKeys("02/25/2015 22:31");
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[3]/td[2]/input")).clear();
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("BPV-00938-60");
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[3]/td[5]/input")).clear();
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[3]/td[5]/input")).sendKeys("BPV-00938-06");
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[4]/td[2]/input")).click();
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[4]/td[2]/input")).clear();
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[4]/td[2]/input")).sendKeys("BPV-00938-61");
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[4]/td[5]/input")).clear();
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[4]/td[5]/input")).sendKeys("BPV-00938-61");
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[5]/td[2]/input")).clear();
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[5]/td[2]/input")).sendKeys("BPV-00938-62");
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[5]/td[5]/input")).clear();
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[5]/td[5]/input")).sendKeys("BPV-00938-62");
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[6]/td[2]/input")).clear();
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[6]/td[2]/input")).sendKeys("BPV-00938-63");
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[6]/td[5]/input")).clear();
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[6]/td[5]/input")).sendKeys("BPV-00938-63");
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[3]/td[8]/input")).clear();
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[3]/td[8]/input")).sendKeys("22");
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[4]/td[8]/input")).clear();
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[4]/td[8]/input")).sendKeys("33");
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[5]/td[8]/input")).clear();
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[5]/td[8]/input")).sendKeys("11");
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[6]/td[8]/input")).clear();
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[6]/td[8]/input")).sendKeys("22");
    driver.findElement(By.id("sub")).click();
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[3]/td[5]/input")).clear();
    driver.findElement(By.xpath("//div[@id='container']/form/div[2]/table/tbody/tr[3]/td[5]/input")).sendKeys("BPV-00938-60");
    driver.findElement(By.id("sub")).click();
    driver.findElement(By.linkText("FFPE Worksheet Main")).click();
    driver.findElement(By.xpath("//span[@id='enat']/input")).click();
    driver.findElement(By.id("ntDisecPerformedBy")).clear();
    driver.findElement(By.id("ntDisecPerformedBy")).sendKeys("xcx");
    driver.findElement(By.id("f1")).click();
    driver.findElement(By.id("ntComment")).clear();
    driver.findElement(By.id("ntComment")).sendKeys("xcxc");
    driver.findElement(By.id("ntFfpeId1")).clear();
    driver.findElement(By.id("ntFfpeId1")).sendKeys("BPV-00938-10");
    driver.findElement(By.id("w7")).clear();
    driver.findElement(By.id("w7")).sendKeys("11");
    driver.findElement(By.id("ntFrozenId1")).clear();
    driver.findElement(By.id("ntFrozenId1")).sendKeys("BPV-00938-11");
    driver.findElement(By.id("w10")).clear();
    driver.findElement(By.id("w10")).sendKeys("22");
    driver.findElement(By.id("sub")).click();
    driver.findElement(By.linkText("FFPE Worksheet Main")).click();
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
