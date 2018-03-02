package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicatiomManager{
  FirefoxDriver wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("C:/Program Files/Mozilla Firefox/firefox.exe"));
  private ContactHelper contactHelper;
  private  GroupHelper groupHelper;
  private SessionHelper sessionHelper;
  private  NaviagtionHelper naviagtionHelper;




  public void init() {

    System.setProperty("webdriver.gecko.driver", "C:/Users/smokehead/Desktop/gecko/geckodriver.exe");
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost:8080/addressbook/group.php");
    contactHelper = new ContactHelper(wd);
    groupHelper = new GroupHelper(wd);
    naviagtionHelper = new NaviagtionHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.logIn("admin", "secret");
  }


  public void stop() {
    wd.quit();
  }



  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NaviagtionHelper getNaviagtionHelper() {
    return naviagtionHelper;
  }


  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
