package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test (enabled = false)
    public void testContactModification() {
        app.getNavigationHelper().goToHomePage();
        if (! app.getContactHelper().isThereContact()) { //if there are no existing contact, Test will create it for modification
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
        app.getContactHelper().fillContactForm(new ContactData(
                "First name2",
                "Middle name2",
                "Last name2",
                "Nick2",
                "Mrs",
                "Test Company2",
                "Test address, 12, 23-24",
                "22222222222",
                "33333333333",
                "444444444444",
                "555555555555",
                "test12@mail.net",
                "test22@mail.net",
                "test32@mail.net",
                "www.test-test2222222.org",
                "Test address, 22, 52-62",
                "66666666666",
                "Test notes here!987654321",
                null
        ), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().goToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before);
    }
}
