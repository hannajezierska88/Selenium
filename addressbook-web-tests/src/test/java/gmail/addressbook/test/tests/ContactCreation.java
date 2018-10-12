package gmail.addressbook.test.tests;

import gmail.addressbook.test.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreation extends TestBase {


  @Test

  public void testContactCreation() {

    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "test3@email.com"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHome();


  }

}
