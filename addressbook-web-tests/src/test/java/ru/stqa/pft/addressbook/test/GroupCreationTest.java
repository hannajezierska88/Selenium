package ru.stqa.pft.addressbook.test;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model1.GroupData;

import java.util.List;


public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreationTest() {

    app.getNaviagtionHelper().goToGroupCreation();
    List<GroupData> before = app.getGroupHelper().getGroupList();

    app.getGroupHelper().createGroup(new GroupData("Test1", null, null));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }
}
