import java.util.*;

public class Company {
  ArrayList<Staff> staffs = new ArrayList<Staff>();
  // ArrayList is used as a DYNAMIC ARRAY --> to store elements of class Staff

  public Company() { // constructor: name of method = class
  }

  public Company(ArrayList<Staff> staffs) {
    this.staffs = staffs;
  }

  public void addStaff(Staff staff) {
    this.staffs.add(staff);
  }

  public void addAllStaff(List<Staff> staffs) {
    this.staffs.addAll(staffs);
  }

  public double totalSalary() {
    return 0;
  }

  public void listStaffWorkingSeniority() {

  } 
}