package guilford.edu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PremierLeague {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Premier League Matches");
        JPanel panel = new JPanel();

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

        Team[] teams = { team1, team2, team3, team4, team5, team6, team7, team8, team9, team10, team11, team12 };

        panel.add(new JLabel("Premier League Matchday 1"));
        panel.add(new JLabel());

        System.out.println("Premier League Matchday 1 \n");

        for (int i = 0; i < teams.length; i += 2) {
            Match match = new Match(teams[i], teams[i + 1]);
            match.playMatch();
            System.out.println("Match " + (i / 2 + 1) + ": " + match.getResult());
            panel.add(new JLabel("Match " + (i / 2 + 1) + ": " + match.getResult()));
        }

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
