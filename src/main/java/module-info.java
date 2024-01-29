module pt.ruiribeiro7it.elitefitness {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.media;

    opens pt.ruiribeiro7it.elitefitness to javafx.fxml;
    exports pt.ruiribeiro7it.elitefitness;
}