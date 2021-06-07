package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testShortContactCreation() {
        app.getNavigationHelper().goToContactPage();
        app.getContactHelper().fillContactForm(new ContactData(
                "Firstname1",
                "Middlename1",
                "Lastname1",
                "Nick",
                "Mr",
                "TestCompany",
                "Test address, 1, 3-4",
                "111111111111",
                "22222222222",
                "33333333333",
                "44444444444",
                "test1@mail.net",
                "test2@mail.net",
                "test3@mail.net",
                "www.test-test123456789.net",
                "Test adress, 2, 5-6",
                "55555555555",
                "Test notes here!1234567890"
        ));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnHomePage();
    }
}
