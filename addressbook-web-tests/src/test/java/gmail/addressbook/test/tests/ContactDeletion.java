package gmail.addressbook.test.tests;

import org.testng.annotations.Test;

public class ContactDeletion extends TestBase {


  @Test

  public void testContactDeletion(){

    app.getContactHelper().selectContact();
    app.getContactHelper().clickContactDelete();
    app.getContactHelper().confirmContactDeletion();
    app.getContactHelper().returnToHome();
  }

}
