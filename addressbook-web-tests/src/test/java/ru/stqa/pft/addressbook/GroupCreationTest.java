package ru.stqa.pft.addressbook;


import org.testng.annotations.Test;



public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreationTest() {

    goToGroupCreation();
    initGroupCreation();
    fillGroupForm(new GroupData("Test1", "Testheader", "Testhadertest"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
