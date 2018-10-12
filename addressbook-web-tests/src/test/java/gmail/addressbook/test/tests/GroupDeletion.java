package gmail.addressbook.test.tests;

import org.testng.annotations.Test;

public class GroupDeletion extends TestBase {



@Test
  public void testGroupDeletion(){

  app.getNavigationHelper().goToGroupPage();
  app.getGrouphelper().selectGroup();
  app.getGrouphelper().deleteSelectedGroups();
  app.getGrouphelper().returnToGroupPage();


  }

}
