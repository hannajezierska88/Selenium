package ru.stqa.pft.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model1.ContactData;


import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class  NewContactCreation extends TestBase {

    
    @Test
    public void testNewContactCreation() {
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getNaviagtionHelper().goToAddNewContact();
        ContactData contact = new ContactData("Hanna", "Jezierska", "+483453845","Test1");
        app.getContactHelper().createNewContact(contact);
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);


        before.add(contact);
      Comparator<? super ContactData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
      before.sort(byId);
      after.sort(byId);
      Assert.assertEquals(before, after);
    }
}

