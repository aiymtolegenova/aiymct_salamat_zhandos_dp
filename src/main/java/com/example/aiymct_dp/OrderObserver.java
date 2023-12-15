package com.example.aiymct_dp;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

import java.util.Objects;

class OrderObserver implements Observer {
    OrderObserver() {
    }

    public void update(HelloController controller, Text text) {
        Notifications notifications1 = Notifications.create();
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("img/order.png")),75,75,false,false);
        notifications1.graphic(new ImageView(image));
        notifications1.text("Notification : \n" + text.getText() + ", Your order is done!");
        notifications1.position(Pos.TOP_RIGHT);
        notifications1.hideAfter(Duration.seconds(3));
        notifications1.show();



    }
}