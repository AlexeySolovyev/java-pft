package ru.stqa.pft.addressbook.model;

public class ContactData {

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickName;
    private final String title;
    private final String company;
    private final String address;
    private final String homePhone;
    private final String mobilePhone;
    private final String workPhone;
    private final String fax;
    private final String email;
    private final String email2;
    private final String email3;
    private final String homePage;
    private final String secondaryAdress;
    private final String secondaryPhone;
    private final String notes;
    private String group;

    public ContactData(
            String firstName,
            String middleName,
            String lastName,
            String nickName,
            String title,
            String company,
            String address,
            String homePhone,
            String mobilePhone,
            String workPhone,
            String fax,
            String email,
            String email2,
            String email3,
            String homePage,
            String secondaryAdress,
            String secondaryPhone,
            String notes,
            String group
    ) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.fax = fax;
        this.email = email;
        this.email2 = email2;
        this.email3 = email3;
        this.homePage = homePage;
        this.secondaryAdress = secondaryAdress;
        this.secondaryPhone = secondaryPhone;
        this.notes = notes;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail2() {
        return email2;
    }

    public String getEmail3() {
        return email3;
    }

    public String getHomePage() {
        return homePage;
    }

    public String getSecondaryAdress() {
        return secondaryAdress;
    }

    public String getSecondaryPhone() {
        return secondaryPhone;
    }

    public String getNotes() {
        return notes;
    }

    public String getGroup() {
        return group;
    }
}
