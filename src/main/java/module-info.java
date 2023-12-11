module com.example.comprobanteegresos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comprobanteegresos to javafx.fxml;
    exports com.example.comprobanteegresos;
}