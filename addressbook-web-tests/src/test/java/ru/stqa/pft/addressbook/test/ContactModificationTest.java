package ru.stqa.pft.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.HelperBase;
import ru.stqa.pft.addressbook.model1.ContactData;

import java.util.List;

public class ContactModificationTest extends TestBase {

  @Test

  public void testContactModification() {
    app.getNaviagtionHelper().contactListPage();
    if ( ! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createNewContact((new ContactData("Hanna", "Jezierska", "+483453845","Test1")));
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(before.size() - 1 );
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillNewContactForm(new ContactData("Hanna", "Jezierska", "+483453845,", null), false);
    app.getContactHelper().submitContactModification();
    app.getNaviagtionHelper().contactListPage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() );


  }
}
