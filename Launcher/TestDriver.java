package Launcher;

import GameEnvironment.GameDriver;
import GameEnvironment.Player;
import boardGameGUI.BoardGame;

import java.io.IOException;

public class TestDriver extends GameDriver {

    TestDriver(String player1Name, String player2Name, int rows, int cols, String gameName) throws IOException {
        super(player1Name, player2Name, rows, cols, gameName);
        Player player1 = new Player(player1Name, 0);
        Player player2 = new Player(player2Name, 1);
        BoardGame game = new BoardGame(player1, player2, rows, cols, gameName);
    }

    public void initializeBoardArray() {

    }

    public void runGame() {

    }

    public void updateScore(int playerIndex, int value) {

    }

    public boolean isLegalMove(int x, int y) {

        return false;
    }

    public void makeMove(int x, int y) {

    }


}