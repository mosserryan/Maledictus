package com.maledictus;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.displaySplash();
        game.createCharacter();
        game.initiateGame();
    }
}