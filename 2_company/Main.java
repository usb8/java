import java.util.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Pair;

/*
NOTE: Name of this class should be same with name of file
NOTE: If the file contains >= 2 class --> (In this case:)
  - Name of class below must be same with name of file
  - Class above must not use 'public'
*/
public class Main extends Application {
  static double companySalary;
  /* 
  1. GLOBAL VARIABLE is obligated -->
    - dùng dc cho JavaFX - old version JDK
    - dùng dc cho JavaFX - new version JDK: import static <com.example.demo.HelloApplication>.companySalary;
  2. STATIC is obligated (e.g. incase no constructors ...)
  */

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

    companySalary = company.totalSalary();
    System.out.print("\n--Total salary is: " + companySalary + " $\n");
    company.listStaffWorkingSeniority();

    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    Dialog<Void> dialog = new Dialog<Void>();
    dialog.setTitle("OAMK Company - autumn 2021");
    dialog.setHeaderText("Total Salary is: ");

    dialog.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);

    GridPane grid = new GridPane();
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(20, 150, 10, 10));

    // grid.add(new Label("SALARY NUMBER"), 0, 0) ;
    String stringCompanySalary = String.valueOf(companySalary);
    grid.add(new Label(stringCompanySalary + " $"), 0, 0);

    dialog.getDialogPane().setContent(grid);

    dialog.showAndWait();
  }
}