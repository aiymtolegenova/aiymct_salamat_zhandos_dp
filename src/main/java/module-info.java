module com.example.aiymct_dp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.aiymct_dp to javafx.fxml;
    exports com.example.aiymct_dp;
}