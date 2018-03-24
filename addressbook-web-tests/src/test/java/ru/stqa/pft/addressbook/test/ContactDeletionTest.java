package ru.stqa.pft.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model1.ContactData;

import java.util.List;

public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion(){
    app.getNaviagtionHelper().contactListPage();
    if ( ! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createNewContact((new ContactData("Hanna", "Jezierska", "+483453845","Test1")));
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(before.size() - 1);
    app.getContactHelper().deleteSelectedContact();
    app.getNaviagtionHelper().acceptDeletion();
    app.getNaviagtionHelper().contactListPage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(before.size() - 1);
      Assert.assertEquals(before, after);

  }
}
