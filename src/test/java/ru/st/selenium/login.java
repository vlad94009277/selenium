package ru.st.selenium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.support.PageFactory;

import ru.st.selenium.pages.HomePage;
import org.openqa.selenium.By;

public class login extends JUnitTestBase {

  private HomePage homepage;

  @Before
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void testHomePageHasAHeader() {
	WebDriver driver = new ChromeDriver();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("php4dvd/")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("submit")).click();
  }
}
