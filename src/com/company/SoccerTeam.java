package com.company;

public class SoccerTeam {
    private int wins;
    private int loses;
    private int ties;
    public SoccerTeam(int w, int l, int t){
        wins = w;
        loses = l;
        ties= t;
    }
    public void played(SoccerTeam other, int myScore, int otherScore){
        if (myScore>otherScore){
            wins++;
            other.loses++;
        }
        if (myScore< otherScore){
            loses ++;
            other.wins++;
        }
        if(myScore==otherScore){
            ties++;
            other.ties++;
        }
    }
    public void reset(){
       wins = 0;
       loses = 0;
       ties = 0;
    }

}
