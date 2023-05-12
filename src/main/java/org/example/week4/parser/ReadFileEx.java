package org.example.week4.parser;


import java.util.ArrayList;
import java.util.List;

public class ReadFileEx {
    public Hospital parse(String str) {
        String[] splitString = str.split(",");

        Address address = new Address(splitString[10], splitString[5], splitString[7]);
        Hospital hospital = new Hospital(splitString[1], splitString[11], address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines){
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    public void printHospitalList(List<Hospital> hospitals){
        for (int i = 0; i < hospitals.size(); i++){
            System.out.printf("%s %s %s\n", hospitals.get(i).getName(), hospitals.get(i).getWebsiteAddr(), hospitals.get(i).getAddress().getFullAddr());
        }
    }
    public static void main(String[] args) {
        ReadFileEx rfe = new ReadFileEx();
        LineReader lineReader = new FileInputStreamLineReader();
        List<String> lines = lineReader.getLines("hospital_10.csv");

        List<Hospital> result = rfe.getHospitals(lines);



        for (int i = 0; i < lines.size(); i++){
            rfe.parse(lines.get(i));
        }

        rfe.printHospitalList(result);
    }
}
