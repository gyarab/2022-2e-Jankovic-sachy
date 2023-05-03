package com.example.rocnikovka_druhak_version2;

import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class King extends Piece{
    public King(int x, int y, String player) {
        super(x, y, player);
        pieceType = "king";

        Text text = new Text("K");
        if (player == "black") {
            text.setFill(Color.WHITE);
        }

        getChildren().addAll(text);
    }
}
