package guilford.edu;

public class Team {
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