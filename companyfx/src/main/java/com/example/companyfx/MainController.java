package com.example.companyfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label salary;

    @FXML
    protected void onButton1() {
        salary.setText("hihi");
    }

    @FXML
    private Label seniority;

    @FXML
    protected void onButton2() {
        seniority.setText("haha");
    }
}