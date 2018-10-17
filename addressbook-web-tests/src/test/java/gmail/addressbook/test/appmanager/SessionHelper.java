package gmail.addressbook.test.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase {


  public SessionHelper(WebDriver wd) {
    super(wd);
  }

  protected void login(String user, String pass) {
    type(By.name("user"),user );
    type(By.name("pass"), pass);
    click(By.xpath("//form[@id= 'LoginForm']/input[3]"));
  }
}
