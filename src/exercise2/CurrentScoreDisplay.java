package exercise2;

public class CurrentScoreDisplay implements DisplayElement {
   Subject subject;
    @Override
    public void onUpdate(Subject subject) {
        System.out.println("************************************");
        System.out.println("Current Score");
        System.out.println("Runs: "+((CricketData)subject).getRuns());
        System.out.println("Wickets: "+((CricketData)subject).getWicket());
        System.out.println("Run Rate: "+((CricketData)subject).getRunRate());
    }
}
