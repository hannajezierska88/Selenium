package gmail.addressbook.test.tests;

import gmail.addressbook.test.model.GroupData;
import org.testng.annotations.Test;

public class GroupModification extends TestBase{

  @Test

  public void testModificationGroup(){

    app.getNavigationHelper().goToGroupPage();
    app.getGrouphelper().selectGroup();
    app.getGrouphelper().initGroupModification();
    app.getGrouphelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGrouphelper().submitGroupModification();
    app.getGrouphelper().returnToGroupPage();

  }
}
