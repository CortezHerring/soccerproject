package guilford.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Match {
    private Team team1;            
    private Team team2;           
    private int team1Goals;         
    private int team2Goals;        
    private List<GameEvent> events; 

    // Constructor for Match class
    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.events = new ArrayList<>(); 
    }

    // Method to simulate playing the match
    public void playMatch() {
        Random random = new Random();           
        team1Goals = random.nextInt(5);         
        team2Goals = random.nextInt(5);        

        
        simulateEvents();
    }

    // Method to simulate game events based on match outcome
    private void simulateEvents() {
        // Check which team won or if it's a draw
        if (team1Goals > team2Goals) {
            events.add(new GameEvent(team1.getName() + " scored a goal!"));
            events.add(new GameEvent(team2.getName() + " missed a penalty!"));
        } else if (team2Goals > team1Goals) {
            events.add(new GameEvent(team2.getName() + " scored a goal!"));
            events.add(new GameEvent(team1.getName() + " received a red card!"));
        } else {
            events.add(new GameEvent("It's a draw!"));
        }
    }

    // Method to get the result of the match
    public String getResult() {
        return team1.getName() + " " + team1Goals + " - " + team2Goals + " " + team2.getName();
    }

    // Method to get the list of game events
    public List<GameEvent> getEvents() {
        return events;
    }

    // Getter method for team1
    public Team getTeam1() {
        return team1;
    }

    // Getter method for team2
    public Team getTeam2() {
        return team2;
    }
}
