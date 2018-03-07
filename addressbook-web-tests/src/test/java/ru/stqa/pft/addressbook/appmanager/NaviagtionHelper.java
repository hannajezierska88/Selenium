package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NaviagtionHelper extends HelperBase{
 // private FirefoxDriver wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("C:/Program Files/Mozilla Firefox/firefox.exe"));

  public NaviagtionHelper(WebDriver wd) {
    super(wd);
  }

  public void goToGroupCreation() {
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent((By.name("new")))) {
      return;
    }
      click(By.linkText("groups"));
    }


  public void goToAddNewContact() {

    wd.findElement(By.linkText("add new")).click();
  }
  public void contactListPage() {
    if (isElementPresent(By.id("maintable"))) {
      return;
    }
    click(By.linkText("home"));
  }

  public void acceptDeletion(){

    wd.switchTo().alert().accept();
  }
}
