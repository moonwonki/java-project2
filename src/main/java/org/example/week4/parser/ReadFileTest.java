package org.example.week4.parser;

import java.io.IOException;
import java.util.List;

public class ReadFileTest {
    public static void main(String[] args) throws IOException {
        ReadFile rfe = new ReadFileNewBufferedReader();
        List<String> result = rfe.getLines("hospital_10.csv");


        for (int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }

    }
}
