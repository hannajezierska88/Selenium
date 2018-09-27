package gmail.addressbook.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ContactDeletion extends TestBase {


  @Test

  public void testContactDeletion(){

    selectContact();
    clickContactDelete();
    confirmContactDeletion();
    returnToHome();
  }

}
