package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicatiomManager{

  WebDriver wd;
  private ContactHelper contactHelper;
  private  GroupHelper groupHelper;
  private SessionHelper sessionHelper;
  private  NaviagtionHelper naviagtionHelper;
  private String browser;

  public ApplicatiomManager(String browser){

    this.browser = browser;
  }


  public void init() {

    if (browser.equals(BrowserType.FIREFOX)){
      wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));//(new FirefoxOptions().setLegacy(true).setBinary("C:/Program Files/Mozilla Firefox/firefox.exe"));
    }else if (browser.equals(BrowserType.CHROME)){
      wd = new ChromeDriver();
    }else if (browser.equals(BrowserType.IE)){
      wd = new InternetExplorerDriver();
    }

    //System.setProperty("webdriver.firefox.marionette", "C:/Users/smokehead/Documents/GitHub/Selenium/addressbook-web-tests");
    wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
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
