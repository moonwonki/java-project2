package org.example.week4.day2;

public class GetMin extends MaxMinAbstract{


    @Override
    public int arrValue(int value, int arrValue) {
        if (value > arrValue) return arrValue;
        else return value;
    }
}
