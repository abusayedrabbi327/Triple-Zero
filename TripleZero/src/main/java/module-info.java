module com.example.triplezero {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.triplezero to javafx.fxml;
    exports com.example.triplezero;
}