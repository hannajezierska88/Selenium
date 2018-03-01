package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NaviagtionHelper extends HelperBase{
 // private FirefoxDriver wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("C:/Program Files/Mozilla Firefox/firefox.exe"));

  public NaviagtionHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void goToGroupCreation() {
    click(By.linkText("groups"));
  }
}
