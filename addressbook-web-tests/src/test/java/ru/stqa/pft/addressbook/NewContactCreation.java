package ru.stqa.pft.addressbook;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class  NewContactCreation extends TestBase{

    
    @Test
    public void testNewContactCreation() {

        goToAddNewContact();
        fillNewContactForm("Hanna", "Jezierska", "+483453845");
        submitNewContactCreation();
        contactListPage();
    }


}

