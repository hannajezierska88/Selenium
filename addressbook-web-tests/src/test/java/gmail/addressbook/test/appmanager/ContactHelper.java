package gmail.addressbook.test.appmanager;

import gmail.addressbook.test.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {


  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToHome() {
    click(By.linkText("home"));
  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"),contactData.getName() );
    type(By.name("lastname"),contactData.getSurname() );
    type(By.name("email"),contactData.getEmail() );

  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void confirmContactDeletion() {
    wd.switchTo().alert().accept();
  }

  public void clickContactDelete() {
    click(By.xpath(".//input[@value='Delete']"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void initContactModification() {
    click(By.xpath(".//*[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void submitContactModification() {
    click(By.name("update"));
  }
}
