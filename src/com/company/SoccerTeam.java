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
        numGoals= myScore+otherScore+numGoals;
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

        startTournament();
        System.out.println("tournament 1");
        tigers.played(dolphins,6,7);
        dolphins.played(pats, 6,6);
        pats.played(bucaneers, 9,10);
        bucaneers.played(dolphins, 5,4);

        System.out.println("Tigers Points:"+ tigers.getPoints());
        System.out.println("Pats Points:"+pats.getPoints());
        System.out.println("Dolphins Points:"+dolphins.getPoints());
        System.out.println("Bucaneers Points:"+bucaneers.getPoints());
        System.out.println("total games:"+getNumGames());
        System.out.println("total Goals:"+getNumGoals());
        dolphins.reset();
        tigers.reset();
        bucaneers.reset();
        pats.reset();

        startTournament();

        System.out.println("tournament 2");

        tigers.played(dolphins,8,7);
        dolphins.played(pats, 6,12);
        pats.played(bucaneers, 7,10);
        bucaneers.played(dolphins, 5,19);

        System.out.println("Tigers Points:"+ tigers.getPoints());
        System.out.println("Pats Points:"+pats.getPoints());
        System.out.println("Dolphins Points:"+dolphins.getPoints());
        System.out.println("Bucaneers Points:"+bucaneers.getPoints());
        System.out.println("total games:"+getNumGames());
        System.out.println("total Goals:"+getNumGoals());

    }
}

//tournament 1
//Tigers Points:0
//Pats Points:1
//Dolphins Points:4
//Bucaneers Points:6
//total games:4
//total Goals:53
//tournament 2
//Tigers Points:3
//Pats Points:3
//Dolphins Points:3
// Bucaneers Points:3
//total games:4
//total Goals:74