public class Staff {
  public String name;
  public int fromYear;
  private String email;
  // private: when user set a new email --> value of email have to satisfy
  // the given condition (E.g.: have "@", ".com", ...)
  protected double salary;

  // constructors - 3 types: default, params, copy
  public Staff() {
  }
  public Staff(String name, String email, int fromYear) {
    this.name = name;
    this.email = email;
    // none setEmail() >>> email can't get at first
    // --> don't have error if invalid email
    this.fromYear = fromYear;
  }
  public Staff(Staff anotherStaff) {
    this.name = anotherStaff.name;
    this.email = anotherStaff.email;
    this.fromYear = anotherStaff.fromYear;
  }

  public String getEmail() {
    return this.email;
  }
  public void setEmail(String newEmail) {
    if (newEmail.contains("@")) {
      this.email = newEmail;
    } else {
      System.out.print("\n This email of " + this.name + " is NOT valid \n");
      this.email = "";
    }
  }
}