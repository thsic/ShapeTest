module jp.lic.shapetest {
    requires javafx.controls;
    requires javafx.fxml;

    opens jp.lic.shapetest to javafx.fxml;
    exports jp.lic.shapetest;
}
