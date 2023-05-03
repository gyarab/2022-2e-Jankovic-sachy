package com.example.rocnikovka_druhak_version2;

import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Knight extends Piece {
    public Knight(int x, int y, String player) {
        super(x, y, player);
        pieceType = "knight";

        Text text = new Text("N");
        if (player == "black") {
            text.setFill(Color.WHITE);
        }

        getChildren().addAll(text);

    }
}
