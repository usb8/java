import java.util.*;

/*
NOTE: Name of this class should be same with name of file
NOTE: If the file contains >= 2 class --> (In this case:)
  - Name of class below must be same with name of file
  - Class above must not use 'public'
*/
public class Main {
  public static void main(String[] args) {
    Worker worker1 = new Worker("Pete1", "w@gmail.com", 2000, 200);
    Worker worker2 = new Worker("Pete2", "w@gmail.com", 2018, 200);
    Worker worker3 = new Worker("Pete2", "w@gmail.com", 2009, 200);
    Officer officer1 = new Officer("Mary1", "o@gmail.com", 2005, 1500, 1);
    Officer officer2 = new Officer("Mary2", "o@gmail.com", 2010, 1600, 2);
    Officer officer3 = new Officer("Mary3", "o@gmail.com", 2015, 1700, 3);
    Company company = new Company();

    // add list so fast with method addAll vs Arrays.asList
    company.addAllStaff(Arrays.asList(worker1, worker2, worker3, officer1, officer2, officer3));

    System.out.print(worker1.name + " - " + worker1.mainSalary() + "\n"
        + officer1.name + "\n" + company.staffs);
  }
}