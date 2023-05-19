module projeto_p3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens projeto_p3 to javafx.fxml;
    exports projeto_p3;
}
