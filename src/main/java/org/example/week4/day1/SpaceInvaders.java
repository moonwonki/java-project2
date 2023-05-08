package org.example.week4.day1;

public class SpaceInvaders {
    int location; // 멤버 변수 선언
    public void moveLeft() {
        location = location - 1; // 기존 값에 -1
    }
    public void moveRight() {
        location = location + 1; // 기존 값에 +1
    }

}
