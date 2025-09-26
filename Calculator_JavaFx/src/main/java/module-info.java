module org.example.calculator_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.calculator_javafx to javafx.fxml;
    exports org.example.calculator_javafx;
}