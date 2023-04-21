package org.example.week1.day5;

public class SpaceInvader {
    private void moveLeft(){
        int location = 0;
        location = -1;
        System.out.printf("moveLeft : %d\n", location);
    }

    private void moveRight(){
        int location = 0;
        location = 1;
        System.out.printf("moveRight : %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvader si = new SpaceInvader();

        si.moveLeft();
        si.moveRight();
    }

}
