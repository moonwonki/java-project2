package org.example.week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar() throws IOException {
        InputStreamReader is;

        is = new InputStreamReader(System.in);

        int asciiCode = is.read();

        System.out.println(asciiCode);
    }

    public void readTwoChars() throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        int asciiCode1 = is.read();
        int asciiCode2 = is.read();

        System.out.println("asciiCode1 = " + asciiCode1);
        System.out.println("asciiCode2 = " + asciiCode2);
    }
}
