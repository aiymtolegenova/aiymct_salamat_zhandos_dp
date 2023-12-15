package com.example.aiymct_dp;

import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

interface Command {
    void execute(HelloController var1, Text var2, ProgressBar var3, StackPane var4);
}