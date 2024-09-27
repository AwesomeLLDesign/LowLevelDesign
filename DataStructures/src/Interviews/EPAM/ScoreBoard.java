package Interviews.EPAM;

import java.util.*;


class Player{

    int score;
    int id;

    public Player(int s, int id){
       this.score = s;
       this.id = id;
    }

}

public class ScoreBoard {

    public static void main(String[] args) {
        List<Player> score = new ArrayList<>();
        score.add(new Player(10,1));
        score.add(new Player(20,2));
        score.add(new Player(30,1));
        score.add(new Player(40,2));
        score.add(new Player(50,3));
        getTopScores(score);
    }

    private static void getTopScores(List<Player> score){

//        Map<Integer,Player> scoreBoard = new SortedMap<Integer, Player>(Collections.reverse()) ;
//
//        for(int i = 0; i < score.size(); i++){
//                scoreBoard.put(score.get(i).score, new Player(score.get(i).score,score.get(i).id));
//
//        }


    }

}
