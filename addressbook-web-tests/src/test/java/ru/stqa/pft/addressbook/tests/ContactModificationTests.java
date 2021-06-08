package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {

        app.getNavigationHelper().goToHomePage();
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
    }
}
