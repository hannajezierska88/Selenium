package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.HelperBase;
import ru.stqa.pft.addressbook.model1.ContactData;

public class ContactModificationTest extends TestBase {

  @Test

  public void testContactModification() {

    app.getContactHelper().contactListPage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillNewContactForm(new ContactData("Hanna", "Jezierska", "+483453845,", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().contactListPage();


  }
}
