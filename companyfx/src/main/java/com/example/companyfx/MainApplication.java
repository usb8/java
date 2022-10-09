package com.example.companyfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;

public class MainApplication extends Application {
    static double companySalary;
    /*
    1. GLOBAL VARIABLE is obligated -->
      - dùng dc cho JavaFX - old version JDK
      - dùng dc cho JavaFX - new version JDK: import static <com.example.demo.HelloApplication>.companySalary;
    2. STATIC is obligated (e.g. incase no constructors ...)
    */

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("OAMK company!");
        stage.setScene(scene);
        stage.show();
    }

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

        launch();
    }
}