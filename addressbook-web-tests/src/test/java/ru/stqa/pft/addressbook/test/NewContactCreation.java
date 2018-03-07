package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model1.ContactData;

public class  NewContactCreation extends TestBase {

    
    @Test
    public void testNewContactCreation() {

        app.getNaviagtionHelper().goToAddNewContact();
        app.getContactHelper().fillNewContactForm(new ContactData("Hanna", "Jezierska", "+483453845","Test1"), true);
        app.getContactHelper().submitNewContactCreation();
        app.getNaviagtionHelper().contactListPage();
    }


}

