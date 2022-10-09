# REQUIREMENT
  General information of staff includes:
    - Name.
    - Email
    - Year of starting work 

  A Company has 2 types of Staffs:
    - Worker:   main salary = product quantity x 10.
    - Officer:  main salary = fixed salary - days off x 100.

  In addition to the main salary, each employee also has an allowance / compensation of 100.
  This allowance / compensation increases by 20 for each year of service at the company. 

  The program can:
    - Add the list of company employees.
    - Calculate the total amount the company has to pay to employees each month.
    - List of employees working for more than 10 years.
    - ...

# ANALYSIS
  INHERITANCE. RELATION IS A & HAS A:
    - Company has Staff
    - Officer & Worker is Staff

  POLYMORPHISM & METHOD OVERRIDING & ABSTRACT METHOD: when do method mainSalary() at class Staff

  Copy constructor & type convertion (Narrowing Casting) at class Worker & Officer
  ArrayList ~ DYNAMIC ARRAY, private email, improve addAll ...
  static ~ GLOBAL VARIABLE

  JavaFX

# SCRIPT:
  - javac Main.java
  - java Main