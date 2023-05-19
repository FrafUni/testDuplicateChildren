module com.example.testduplicatechildren {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.testduplicatechildren to javafx.fxml;
    exports com.example.testduplicatechildren;
}