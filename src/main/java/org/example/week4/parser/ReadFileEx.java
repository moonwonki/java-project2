package org.example.week4.parser;

import java.io.*;

public class ReadFileEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\MoonWonKi\\git\\java\\java-project2\\1.병원정보서비스 2022.10..csv"), "utf-8"));
        System.out.println(br.readLine());
    }
}
