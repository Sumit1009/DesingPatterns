package exercise2;

import exercise2.Subject;

public class AverageScoreDisplay implements DisplayElement {
    @Override
    public void onUpdate(Subject subject) {
        System.out.println("+++++++++++++++++++++++++++=");
        System.out.println("Average Score");
    }
}
