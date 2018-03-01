package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class  NewContactCreation extends TestBase{

    
    @Test
    public void testNewContactCreation() {

        goToAddNewContact();
        fillNewContactForm(new ContactData("Hanna", "Jezierska", "+483453845"));
        submitNewContactCreation();
        contactListPage();
    }


}

