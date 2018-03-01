package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.concurrent.TimeUnit;

public class ApplicatiomManager {
  FirefoxDriver wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("C:/Program Files/Mozilla Firefox/firefox.exe"));
  private SessionHelper sessionHelper;
  private  NaviagtionHelper naviagtionHelper;
  private  GroupHelper groupHelper;



  public void init() {
    System.setProperty("webdriver.gecko.driver", "C:/Users/smokehead/Desktop/gecko/geckodriver.exe");
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost:8080/addressbook/group.php");
    groupHelper = new GroupHelper(wd);
    naviagtionHelper = new NaviagtionHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.logIn("admin", "secret");
  }


  public void stop() {
    wd.quit();
  }

  public void contactListPage() {
      wd.findElement(By.linkText("home")).click();
  }

  public void submitNewContactCreation() {
      wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void fillNewContactForm(ContactData contactData) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(contactData.getName());
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
      wd.findElement(By.name("mobile")).click();
      wd.findElement(By.name("mobile")).clear();
      wd.findElement(By.name("mobile")).sendKeys(contactData.getMobileNo());
  }

  public void goToAddNewContact() {
      wd.findElement(By.linkText("add new")).click();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NaviagtionHelper getNaviagtionHelper() {
    return naviagtionHelper;
  }

  public void goToGroupCreation() {
    naviagtionHelper.goToGroupCreation();
  }
}
