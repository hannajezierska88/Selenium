package gmail.addressbook.test.tests;

import gmail.addressbook.test.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreation extends TestBase {


  @Test
  public void testGroupCreation(){

    app.getNavigationHelper().goToGroupPage();
    app.getGrouphelper().initGroupCreation();
    app.getGrouphelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGrouphelper().submitGroupCreation();
    app.getGrouphelper().returnToGroupPage();


  }

}