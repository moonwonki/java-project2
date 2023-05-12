package org.example.week4.parser;

import java.util.List;
//getLines 추상화 위한 LineReader 인터페이스
public interface LineReader {
    List<String> getLines(String fileName);
}
