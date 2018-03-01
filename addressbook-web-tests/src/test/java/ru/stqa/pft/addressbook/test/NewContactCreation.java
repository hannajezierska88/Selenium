package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model1.ContactData;

public class  NewContactCreation extends TestBase {

    
    @Test
    public void testNewContactCreation() {

        app.goToAddNewContact();
        app.fillNewContactForm(new ContactData("Hanna", "Jezierska", "+483453845"));
        app.submitNewContactCreation();
        app.contactListPage();
    }


}

