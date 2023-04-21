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
        SpaceInvaderMemberVariable si = new SpaceInvaderMemberVariable();

        si.moveLeft();
        si.moveRight();
        si.moveRight();
        si.moveRight();

    }
}
