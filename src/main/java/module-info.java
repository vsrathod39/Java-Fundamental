module com.example.angiejones {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.angiejones to javafx.fxml;
    exports com.example.angiejones;
}