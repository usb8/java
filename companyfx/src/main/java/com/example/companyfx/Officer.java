package com.example.companyfx;

class Officer extends Staff {
  protected double fixedSalary;
  protected int dayOff;

  public Officer(String name, String email, int fromYear, double fixedSalary, int dayOff) {
    super(name, email, fromYear);
    this.fixedSalary = fixedSalary;
    this.dayOff = dayOff;
  }

  // copy constructor: this time anotherWorker of class Worker convert to Staff
  public Officer(Officer anotherOfficer, double fixedSalary, int dayOff) {
    super((Staff) anotherOfficer);
    this.fixedSalary = fixedSalary;
    this.dayOff = dayOff;
  }

  @Override
  protected double mainSalary() {
    return this.fixedSalary - this.dayOff * 100;
  }
}