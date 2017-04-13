package exercise4.characters;

import exercise4.fighter.Fighter;
import exercise4.moves.*;

public class Robin extends Fighter implements Jump, Roll {

    public Robin() {
        super();
    }

    public void display() {
        System.out.println("Robin");
    }

    public void setMoves(Integer level) {
        if (level == 1) {
            super.setJump(new ShortJump());
            super.setRoll(new SingleRoll());
            return;
        }
        if (level == 2) {
            super.setJump(new LongJump());
            super.setRoll(new DoubleRoll());
            return;
        }
    }
}
