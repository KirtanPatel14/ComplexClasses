package com.company;

public class SoccerTeam {
    private int wins;
    private int loses;
    private int ties;
    private static int numGames;
    private static int numGoals;
    public SoccerTeam(){
        wins = 0;
        loses = 0;
        ties= 0;
    }
    public void played(SoccerTeam other, int myScore, int otherScore){
        numGames++;
        numGoals = myScore+otherScore;
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
    public int getPoints(){
        return wins*3+ties;
    }
    public void reset(){
       wins = 0;
       loses = 0;
       ties = 0;
    }
    public static int getNumGames(){
        return numGames;
    }
    public static int getNumGoals(){
        return numGoals;
    }
    public static void startTournament(){
        numGames = 0;
        numGoals = 0;
    }

    public static void main(String[] args) {
        SoccerTeam tigers = new SoccerTeam();
        SoccerTeam dolphins = new SoccerTeam();
        SoccerTeam pats = new SoccerTeam();
        SoccerTeam bucaneers = new SoccerTeam();

        tigers.played(dolphins,6,7);
        System.out.println();

    }
}

