package ru.stqa.pft.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.HelperBase;
import ru.stqa.pft.addressbook.model1.ContactData;

import java.util.Comparator;
import java.util.HashSet;
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
    ContactData contact = new ContactData (before.get(before.size() - 1 ).getId(),"Hanna", "Jezierska", "+483453845,", null);
    app.getContactHelper().fillNewContactForm(contact,false);
    app.getContactHelper().submitContactModification();
    app.getNaviagtionHelper().contactListPage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() );

    before.remove(before.size() - 1 );
    before.add(contact);
    Comparator<? super ContactData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);


  }
}
