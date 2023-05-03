package com.example.rocnikovka_druhak_version2;

import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Bishop extends Piece{
    public Bishop(int x, int y, String player) {
        super(x, y, player);
        pieceType = "bishop";

        Text text = new Text("B");
        if (player == "black") {
            text.setFill(Color.WHITE);
        }

        getChildren().addAll(text);

    }
}
