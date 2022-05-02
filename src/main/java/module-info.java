module com.example.dama321 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dama321 to javafx.fxml;
    exports com.example.dama321;
}