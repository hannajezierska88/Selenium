package ru.stqa.pft.addressbook.test;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model1.GroupData;


public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreationTest() {

    app.getNaviagtionHelper().goToGroupCreation();
    app.getGroupHelper().createGroup(new GroupData("Test1", null, null));
  }
}
