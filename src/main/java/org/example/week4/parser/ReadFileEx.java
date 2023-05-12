package org.example.week4.parser;


import java.util.List;

public class ReadFileEx {
    public Hospital parse(String str) {
        String[] splitted = str.split(",");

        Address address = new Address();
        Hospital hospital = new Hospital("", "", address);

        return hospital;

    }



    public static void main(String[] args) {
        ReadFileEx rfe = new ReadFileEx();
        LineReader lineReader = new FileInputStreamLineReader();
        List<String> result = lineReader.getLines("hospital_10.csv");

        for (int i = 0; i < result.size(); i++){
            rfe.parse(result.get(i));
            System.out.println(result.get(i));
        }
    }
}
