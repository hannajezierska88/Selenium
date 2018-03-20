package ru.stqa.pft.addressbook.test;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model1.GroupData;
import java.util.HashSet;
import java.util.List;


public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreationTest() {

    app.getNaviagtionHelper().goToGroupCreation();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    GroupData group = new GroupData ("Test2", null, null);
    app.getGroupHelper().createGroup(group);
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);

    group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
    before.add(group);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
  }
}
