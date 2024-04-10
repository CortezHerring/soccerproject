package guilford.edu;

    import java.util.Random;
    
    class Team {
        private String name;
        private int ranking;
    
        public Team(String name, int ranking) {
            this.name = name;
            this.ranking = ranking;
        }
    
        public String getName() {
            return name;
        }
    
        public int getRanking() {
            return ranking;
        }
    
        @Override
        public String toString() {
            return name;
        }
    }
    
    class Match {
        private Team team1;
        private Team team2;
        private int team1Goals;
        private int team2Goals;
    
        public Match(Team team1, Team team2) {
            this.team1 = team1;
            this.team2 = team2;
        }
    
        public void playMatch() {
            Random random = new Random();
            team1Goals = random.nextInt(5);
            team2Goals = random.nextInt(5);
        }
    
        public String getResult() {
            return team1.getName() + " " + team1Goals + " - " + team2Goals + " " + team2.getName();
        }
    }

