package org.example.game;

public enum GameStatus {
    INIT,START,WIN,LOSE
}

import java.util.ArrayList;

public class MovesHistory {
    ArrayList<String> movesHistory;

    public MovesHistory(){
        movesHistory = new ArrayList<String>();
    }

    public void addMove(String move){
        movesHistory.add(move);
    }

    public void printHistory(){
        for (String m : movesHistory) {
            System.out.println(m);
        }
    }

    public void outputHistory(String answer){
        if(answer.equals("y")){
            printHistory();
        }
    }
}
