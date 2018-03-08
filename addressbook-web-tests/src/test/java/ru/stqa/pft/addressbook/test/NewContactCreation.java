package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model1.ContactData;

public class  NewContactCreation extends TestBase {

    
    @Test
    public void testNewContactCreation() {

        app.getNaviagtionHelper().goToAddNewContact();
        app.getContactHelper().createNewContact(new ContactData("Hanna", "Jezierska", "+483453845","Test1"));

    }


}

