package com.example.rocnikovka_druhak_version2;

import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Queen extends Piece{
    public Queen(int x, int y, String player) {
        super(x, y, player);
        pieceType = "queen";

        Text text = new Text("Q");
        if (player == "black") {
            text.setFill(Color.WHITE);
        }

        getChildren().addAll(text);
    }
}
