package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model1.ContactData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void initContactCreation(){
    click(By.linkText("add new"));
  }

  public void backToHome(){
    click(By.linkText("home"));
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

  public void selectContact(int index){
    wd.findElements(By.name("selected[]")).get(index).click();

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

  public void createNewContact(ContactData contact) {
    initContactCreation();
    fillNewContactForm(contact, true);
    submitNewContactCreation();
    backToHome();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

  public List<ContactData> getContactList() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.name("entry"));
    for (WebElement element : elements){
      String contactRow = element.getText();
      ContactData contact = new ContactData(contactRow, null, null, null);
      contacts.add(contact);
    }

    return contacts;
  }
}
