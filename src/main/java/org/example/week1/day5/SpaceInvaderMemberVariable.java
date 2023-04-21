package org.example.week1.day5;

public class SpaceInvaderMemberVariable {
    int location;
    public void moveLeft(){
        location = location - 1;
        System.out.printf("moveLeft : %d\n", location);
    }

    public void moveRight(){
        location = location + 1;
        System.out.printf("moveRight : %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvaderMemberVariable simv = new SpaceInvaderMemberVariable();

        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();

        System.out.printf("최종 위치: %d", simv.location);

    }
}
