package exercise2;

public class Application {
    public static void main(String[] args) {
        Subject subject=new CricketData();
        subject.attach(new AverageScoreDisplay());
        subject.attach(new CurrentScoreDisplay());
        ((CricketData)subject).setBowls(100);
        ((CricketData)subject).setRunRate(4.99);
        ((CricketData)subject).setRuns(100);
        ((CricketData)subject).setWicket(1);
        subject.notifyElements();
    }
}
