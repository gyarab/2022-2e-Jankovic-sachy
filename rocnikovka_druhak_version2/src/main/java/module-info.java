module com.example.rocnikovka_druhak_version2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rocnikovka_druhak_version2 to javafx.fxml;
    exports com.example.rocnikovka_druhak_version2;
}