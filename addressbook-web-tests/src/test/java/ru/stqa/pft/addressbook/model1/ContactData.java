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
  @Override
  public String toString() {
    return "ContactData{" +
            "name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    return name != null ? name.equals(that.name) : that.name == null;
  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }
}
