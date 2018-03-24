package ru.stqa.pft.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model1.ContactData;


import java.util.List;

public class  NewContactCreation extends TestBase {

    
    @Test
    public void testNewContactCreation() {
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getNaviagtionHelper().goToAddNewContact();
        app.getContactHelper().createNewContact(new ContactData("Hanna", "Jezierska", "+483453845","Test1"));
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);

    }
}

