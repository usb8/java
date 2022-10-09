module com.example.companyfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.companyfx to javafx.fxml;
    exports com.example.companyfx;
}