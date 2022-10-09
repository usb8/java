package com.example.companyfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import static com.example.companyfx.MainApplication.companySalary;
import static com.example.companyfx.MainApplication.senior;

public class MainController {
    @FXML
    private Label salary;

    @FXML
    protected void onButton1() {
        salary.setText(String.valueOf(companySalary));
    }

    @FXML
    private Label seniority;

    @FXML
    protected void onButton2() {
        seniority.setText(senior);
    }
}