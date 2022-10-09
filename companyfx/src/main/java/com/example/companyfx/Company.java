package com.example.companyfx;

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

  protected double totalSalary() {
    double sum = 0;
    for (Staff item : this.staffs) {
      sum += item.grossSalary();
    }
    return sum;
  }

  protected void listStaffWorkingSeniority() {
    System.out.print("--List staffs working Seniority more than 10 years:\n");
    for (Staff item : this.staffs) {
      int yearsOfService = Calendar.getInstance().get(Calendar.YEAR) - item.fromYear;
      if (yearsOfService >= 10) {
        System.out.print("    " + item.name + " - " + yearsOfService + " years working here");
      }
    }
    System.out.println();
  } 
}