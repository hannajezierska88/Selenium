package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import ru.stqa.pft.addressbook.model1.ContactData;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void contactListPage() {
      click(By.xpath("//div/div[3]/ul/li[1]/a"));
  }

  public void submitNewContactCreation() {
      click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillNewContactForm(ContactData contactData) {
      type(By.name("firstname"),contactData.getName());
      type(By.name("lastname"),contactData.getLastName());
      type(By.name("mobile"), contactData.getMobileNo());

  }

  public void selectContact(){
    click(By.name("selected[]"));

  }

  public void deleteSelectedContact(){
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void initContactModification() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void submitContactModification() {
    click(By.xpath("//div[@id='content']/form[1]/input[22]"));
  }
}
