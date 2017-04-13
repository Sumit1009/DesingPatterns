package exercise4;

import exercise4.characters.Ben;
import exercise4.characters.Robin;
import exercise4.fighter.Fighter;

public class StreetFighter {
    public static void main(String[] args) {
        Fighter fighter = new Ben();
        fighter.display();
        fighter.jump();
        fighter.kick();
        fighter.roll();
        fighter.levelUp();
        fighter = new Robin();
        fighter.display();
        fighter.jump();
        fighter.kick();
        fighter.roll();
        fighter.levelUp();
    }
}
