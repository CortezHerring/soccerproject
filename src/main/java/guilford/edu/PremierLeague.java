package guilford.edu;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.Component; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PremierLeague {
    private static JFrame frame;
    private static JPanel panel;
    private static JButton showScoresButton;
    private static List<Match> matches;

    // New field for panel color
    private static Color panelColor = Color.WHITE;

    // Main method
    public static void main(String[] args) {
        // Initialize frame, panel, button, and match list
        frame = new JFrame("Premier League Matches");
        panel = new JPanel();
        showScoresButton = new JButton("Show Game Events");
        matches = new ArrayList<>();

        // Add action listener to the button
        showScoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                showScores();
            }
        });

        // Customize the panel
        setupPanel();

        // Add panel to frame and set frame properties
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Method to set up the panel
    private static void setupPanel() {
        // Set layout for the panel
        panel.setLayout(new GridLayout(0, 1)); 

        // Set the background color of the panel
        panel.setBackground(panelColor);

        // Add components to the panel
        panel.add(new JLabel("Premier League Matchday 1"));
        panel.add(showScoresButton);

        // Generate matches and display on panel
        generateMatches();
    }

    // Method to generate matches
    private static void generateMatches() {
        Team[] teams = createTeams(); // Create teams

        // Generate matches and display on panel
        for (int i = 0; i < teams.length; i += 2) {
            Match match = new Match(teams[i], teams[i + 1]);
            match.playMatch();
            matches.add(match);
            panel.add(new JLabel("Match " + (i / 2 + 1) + ": " + match.getResult()));
        }
    }

    // Method to create an array of teams
    private static Team[] createTeams() {
        // Create teams
        Team team1 = new Team("Arsenal", 1);
        Team team2 = new Team("Aston Villa", 2);
        Team team3 = new Team("Brentford", 3);
        Team team4 = new Team("Brighton", 4);
        Team team5 = new Team("Bournemouth", 5);
        Team team6 = new Team("Burnley", 6);
        Team team7 = new Team("Chelsea", 7);
        Team team8 = new Team("Crystal Palace", 8);
        Team team9 = new Team("Everton", 9);
        Team team10 = new Team("Fulham", 10);
        Team team11 = new Team("Liverpool", 11);
        Team team12 = new Team("Luton", 12);
        Team team13 = new Team("Manchester City", 13);
        Team team14 = new Team("Manchester United", 14);
        Team team15 = new Team("Newcastle United", 15);
        Team team16 = new Team("Nottingham Forest", 16);
        Team team17 = new Team("Sheffield United", 17);
        Team team18 = new Team("Tottenham Hotspur", 18);
        Team team19 = new Team("West Ham", 19);
        Team team20 = new Team("Wolves", 20);
        // Return array of teams
        return new Team[]{team1, team2, team3, team4, team5, team6, team7, team8, team9, team10, team11, team12,
                team13, team14, team15, team16, team17, team18, team19, team20};
    }

    // Method to display match scores and events
    private static void showScores() {
        StringBuilder message = new StringBuilder();
        // Show match results
        message.append("Match Results:\n");
        for (Component component : panel.getComponents()) {
            if (component instanceof JLabel) {
                message.append(((JLabel) component).getText()).append("\n");
            }
        }
        // Show game events
        message.append("\nGame Events:\n");
        for (Match match : matches) {
            message.append("Match between ").append(match.getTeam1().getName()).append(" and ")
                    .append(match.getTeam2().getName()).append(":\n");
            for (GameEvent event : match.getEvents()) {
                message.append(event.toString()).append("\n");
            }
            message.append("\n");
        }
        // Show message dialog with scores and events
        JOptionPane.showMessageDialog(frame, message.toString());
    }

    // Method to set the color of the panel
    public static void setPanelColor(Color color) {
        panelColor = color;
        panel.setBackground(panelColor);
    }
}

