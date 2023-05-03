package com.example.rocnikovka_druhak_version2;

import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Pawn extends Piece{
    public Pawn(int x, int y, String player) {
        super(x, y, player);
        pieceType = "pawn";

        Text text = new Text("P");
        if (player == "black") {
            text.setFill(Color.WHITE);
        }

        getChildren().addAll(text);

    }
}
