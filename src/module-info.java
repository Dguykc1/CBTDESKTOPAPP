module CBTDESKTOPAPP.FOR.APTITUDE.TEST {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    opens sample to javafx.controls,javafx.graphics,javafx.fxml;
}