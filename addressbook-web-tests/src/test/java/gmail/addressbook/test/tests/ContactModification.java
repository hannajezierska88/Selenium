package gmail.addressbook.test.tests;

import gmail.addressbook.test.model.ContactData;
import org.testng.annotations.Test;

public class ContactModification extends TestBase {

  @Test

  public void testContactModification() {

    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "test3@email.com"));
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHome();


  }
}
