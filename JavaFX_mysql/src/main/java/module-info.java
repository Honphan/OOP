module org.example.javafx_mysql {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens org.example.javafx_mysql to javafx.fxml;
    exports org.example.javafx_mysql;
}