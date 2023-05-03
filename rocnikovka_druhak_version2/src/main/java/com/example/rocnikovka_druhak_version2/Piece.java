package com.example.rocnikovka_druhak_version2;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import static com.example.rocnikovka_druhak_version2.constants.*;

public class Piece extends StackPane {

    private double mouseX, mouseY;
    private double oldX, oldY;

    protected String color;
    protected String pieceType;

    public double getOldX() {
        return oldX;
    }
    public double getOldY() {
        return oldY;
    }

    public String getColor() {
        return color;
    }

    public String getPieceType() {
        return pieceType;
    }

    public Piece (int x, int y, String player) {

        move(x, y);
        this.color = player;
        this.pieceType = pieceType;

        Circle circle = new Circle(x, y, viewSize);
        Text text = new Text();

        if (player == "white") {
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.BLACK);
            text.setFill(Color.BLACK);
        } else  {
            circle.setFill(Color.BLACK);
            circle.setStroke(Color.WHITE);
            text.setFill(Color.WHITE);
        }


        getChildren().addAll(circle, text);

        setOnMousePressed(e -> {
            mouseX = e.getSceneX();
            mouseY = e.getSceneY();
        });

        setOnMouseDragged(e -> {
            relocate(e.getSceneX() - mouseX + oldX, e.getSceneY() - mouseY + oldY);
        });

        
    }

    public void move(int x, int y) {
        oldX = x * tileSize + 0.25 * tileSize;
        oldY = y * tileSize + 0.25 * tileSize;
        relocate(oldX, oldY);
    }

    public void abortMove() {
        relocate(oldX, oldY);
    }

}
