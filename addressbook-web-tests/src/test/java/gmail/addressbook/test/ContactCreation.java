package gmail.addressbook.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactCreation extends TestBase {


  @Test

  public void testContactCreation() {

    initContactCreation();
    fillContactForm(new ContactData("test1", "test2", "test3@email.com"));
    submitContactCreation();
    returnToHome();


  }

}
