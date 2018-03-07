package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model1.ContactData;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }



  public void submitNewContactCreation() {
      click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillNewContactForm(ContactData contactData, boolean creation) {
      type(By.name("firstname"),contactData.getName());
      type(By.name("lastname"),contactData.getLastName());
      type(By.name("mobile"), contactData.getMobileNo());

      if (creation){
        new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
      }else{
        Assert.assertFalse(isElementPresent((By.name("new_group"))));
      }
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
