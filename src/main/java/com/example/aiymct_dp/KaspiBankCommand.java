package com.example.aiymct_dp;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.util.Duration;

class KaspiBankCommand implements Command {
    KaspiBankCommand() {
    }

    public void execute(HelloController controller, Text text, ProgressBar progressBar, StackPane stackPane) {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5.0), (ae) -> {
            progressBar.setVisible(true);
            stackPane.getChildren().addAll(progressBar, text);
            controller.inProcessPane.getChildren().add(stackPane);
        }));
        timeline.play();
        timeline.setOnFinished((event1) -> {
            Duration duration = Duration.seconds((double) HelloController.t / 100);
            KeyValue keyValue = new KeyValue(progressBar.progressProperty(), 1);
            KeyFrame keyFrame = new KeyFrame(duration, keyValue);
            Timeline timeline1 = new Timeline(keyFrame);
            timeline1.play();
            timeline1.setOnFinished((event2) -> {
                progressBar.setVisible(false);
                controller.inOrderPane.getChildren().remove(text);
                controller.donePane.getChildren().add(text);
                controller.inProcessPane.getChildren().remove(stackPane);
                Notify notify = new DoneOrder();
                notify.notifyObserver(controller, text);
            });
        });
    }
}
