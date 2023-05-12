package org.example.week4.parser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class ReadFileInputStreamReader implements ReadFile{
    public static void main(String[] args) throws IOException {
        ReadFile rfe = new ReadFileInputStreamReader();
        List<String> result = rfe.getLines("hospital_info_0920_utf8.csv");
        System.out.println(result.get(1));

    }

    public List<String> getLines(String fileName) {
        List<String> lines = new LinkedList<>();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))){

            String line;
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lines;
    }
}
