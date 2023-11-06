module com.example.opp_mid {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.opp_mid to javafx.fxml;
    exports com.example.opp_mid;
}