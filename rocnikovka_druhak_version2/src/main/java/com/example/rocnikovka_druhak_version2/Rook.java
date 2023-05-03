package com.example.rocnikovka_druhak_version2;

import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Rook extends Piece{
    public Rook(int x, int y, String player) {
        super(x, y, player);
        pieceType = "rook";

        Text text = new Text("R");
        if (player.equals("black")) {
            text.setFill(Color.WHITE);
        }

        getChildren().addAll(text);
    }
}
