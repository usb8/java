import java.util.*;

/*
NOTE: Name of this class should be same with name of file
NOTE: If the file contains >= 2 class --> (In this case:)
  - Name of class below must be same with name of file
  - Class above must not use 'public'
*/
public class Main {
  public static void main(String[] args) {
    Staff staff1 = new Staff("Pete1", "w@gmail.com", 2000);
    Staff staff2 = new Staff("Pete2", "w@gmail.com", 2018);
    Company company = new Company();

    // add list so fast with method addAll vs Arrays.asList
    company.addAllStaff(Arrays.asList(staff1, staff2));

    System.out.print(staff1.name + "\n" + company.staffs);
  }
}