package exercise4.fighter;

import exercise4.moves.Jump;
import exercise4.moves.Roll;

public abstract class Fighter {
    private Integer level;
    private Jump jump;
    private Roll roll;

    public Fighter() {
        setLevel(1);
    }

    protected void setJump(Jump jump) {
        this.jump = jump;
    }

    protected void setRoll(Roll roll) {
        this.roll = roll;
    }

    public void kick() {
        System.out.println("kick");
    }

    public void punch() {
        System.out.println("punch");
    }

    public void roll() {
        roll.roll();
    }

    public void jump() {
        jump.jump();
    }

    protected void setLevel(Integer level) {
        this.level = level;
        setMoves(level);
    }

    public void levelUp() {
        level++;
        setLevel(level);
        System.out.println("Welcome to level:" + level);
    }

    protected abstract void setMoves(Integer level);

    public abstract void display();
}
