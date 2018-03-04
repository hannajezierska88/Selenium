package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model1.GroupData;

public class GroupModificationTest extends TestBase {

  @Test
  public void testGroupModification(){
    app.getNaviagtionHelper().goToGroupCreation();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("Test1", "Testheader", "Testhadertest"));
    app.getGroupHelper().sumbitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}
