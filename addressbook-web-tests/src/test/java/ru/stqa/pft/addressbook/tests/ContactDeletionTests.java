package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {

        app.getNavigationHelper().goToHomePage();
        if (! app.getContactHelper().isThereContact()) { //if there are no existing contact, Test will create it for deleteion
            app.getContactHelper().createReserveContact(new ContactData(
                    "Test",
                    "Test",
                    "Test",
                    "Test",
                    "Sir",
                    "Test",
                    "Test",
                    "99999999999",
                    "88888888888",
                    "77777777777",
                    "6666666666",
                    "test@mail.com",
                    "test2@mail.com",
                    "test3@mail.com",
                    "www.test.com",
                    "Test",
                    "00000000001",
                    "Test",
                    "test1"));
        }
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactModification();
        app.getContactHelper().deleteContact();
        app.getNavigationHelper().goToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before - 1);
    }
}
