package com.example.aiymct_dp;

import javafx.scene.text.Text;

class DoneOrder implements Notify {
    DoneOrder() {
    }

    public void notifyObserver(HelloController controller, Text text) {
        Observer observer = new OrderObserver();
        observer.update(controller, text);
    }
}

