package ru.stqa.pft.addressbook.model1;

public class ContactData {
  private final String name;
  private final String lastName;
  private final String mobileNo;
  private String group;

  public ContactData(String name, String lastName, String mobileNo, String group) {
    this.name = name;
    this.lastName = lastName;
    this.mobileNo = mobileNo;
    this.group = group;
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

  public String getGroup() {
    return group;
  }
}
