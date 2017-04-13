package exercise2;

public class CricketData extends Subject {
    private Integer runs;
    private Double runRate;
    private Integer wicket;
    private Integer bowls;

    public Integer getBowls() {
        return bowls;
    }

    public void setBowls(Integer bowls) {
        this.bowls = bowls;
    }

    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public Double getRunRate() {
        return runRate;
    }

    public void setRunRate(Double runRate) {
        this.runRate = runRate;
    }

    public Integer getWicket() {
        return wicket;
    }

    public void setWicket(Integer wicket) {
        this.wicket = wicket;
    }
}
