module pe.edu.upeu.sys {
    requires javafx.controls;
    requires javafx.fxml;


    opens pe.edu.upeu.sys to javafx.fxml;
    exports pe.edu.upeu.sys;
}