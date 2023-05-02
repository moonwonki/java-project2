package org.example.codeup.codeup1000;

import java.io.*;

import java.util.StringTokenizer;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rInput = Integer.parseInt(st.nextToken());
        int gInput = Integer.parseInt(st.nextToken());
        int bInput = Integer.parseInt(st.nextToken());

        int count = 0;
        for (int r = 0; r < rInput; r++){
            for (int g = 0; g < gInput; g++){
                for (int b = 0; b < bInput; b++){
                    String temp = r + " " + g + " " + b + "\n";
                    count++;
                    bw.write(temp);
                }
                bw.flush();
            }
        }
        System.out.println(count);

    }
}