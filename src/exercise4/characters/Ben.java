package exercise4.characters;

import exercise4.fighter.Fighter;
import exercise4.moves.DoubleRoll;
import exercise4.moves.LongJump;
import exercise4.moves.ShortJump;
import exercise4.moves.SingleRoll;

public class Ben extends Fighter {
    public Ben() {
        super();
    }

    @Override
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

    public void display() {
        System.out.println("Ben");
    }


}

