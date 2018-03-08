package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model1.ContactData;

public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion(){

    app.getNaviagtionHelper().contactListPage();
    if ( ! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createNewContact((new ContactData("Hanna", "Jezierska", "+483453845","Test1")));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getNaviagtionHelper().acceptDeletion();
    app.getNaviagtionHelper().contactListPage();


  }
}
