package ru.stqa.pft.addressbook.model1;

public class ContactData {
  private final String name;
  private final String lastName;
  private final String mobileNo;

  public ContactData(String name, String lastName, String mobileNo) {
    this.name = name;
    this.lastName = lastName;
    this.mobileNo = mobileNo;
  }

  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public String getMobileNo() {
    return mobileNo;
  }
}
