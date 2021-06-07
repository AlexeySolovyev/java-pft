package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().goToContactPage();
        app.getContactHelper().fillContactForm(new ContactData(
                "First name1",
                "Middle name1",
                "Last name1",
                "Nick",
                "Mr",
                "Test Company",
                "Test address, 1, 3-4",
                "11111111111",
                "22222222222",
                "33333333333",
                "44444444444",
                "test1@mail.net",
                "test2@mail.net",
                "test3@mail.net",
                "www.test-test123456789.net",
                "Test address, 2, 5-6",
                "55555555555",
                "Test notes here!1234567890",
                "test1"
        ), true);
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().goHomePage();
    }
}
