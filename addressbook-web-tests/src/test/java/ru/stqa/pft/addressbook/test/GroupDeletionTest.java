package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model1.GroupData;

public class GroupDeletionTest extends TestBase {


    
    @Test
    public void testGroupDeletion(){

        app.getNaviagtionHelper().goToGroupCreation();
        if ( ! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("Test1", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }


}

