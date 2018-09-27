package gmail.addressbook.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupDeletaion extends TestBase{



@Test
  public void testGroupDeletion(){

  goToGroupPage();
  selectGroup();
  deleteSelectedGroups();
  returnToGroupPage();


  }

}
