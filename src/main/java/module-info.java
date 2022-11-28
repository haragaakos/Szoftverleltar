module com.example.szoftverleltar {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.szoftverleltar to javafx.fxml;
    exports com.example.szoftverleltar;
}