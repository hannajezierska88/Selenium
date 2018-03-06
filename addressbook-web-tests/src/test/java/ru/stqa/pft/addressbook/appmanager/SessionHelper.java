package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase{


  public SessionHelper(WebDriver wd) {
    super(wd);
  }

  public void logIn(String username, String password) {
    type(By.name("user"), username);
    type(By.name("pass"),password );
    click(By.xpath("//div/div[4]/form/input[3]"));
  }

}
