package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion(){

    app.getContactHelper().contactListPage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getNaviagtionHelper().acceptDeletion();
    app.getContactHelper().contactListPage();


  }
}
