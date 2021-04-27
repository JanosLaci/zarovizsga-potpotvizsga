package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DaVinciCode {

    String[] acceptedInputs = "x10".split("");

    public int encode(String inputString, char inputChar) {

        // &&, nem ||
        // konstans Stringtömb splittel, majd contains Arrays.asList-tel
        if (inputChar!='x' && inputChar!='1' && inputChar!='0')  {
            throw new IllegalArgumentException("Invalid input."); }

        int charCounter=0;


        try {
            BufferedReader bufferedReader = Files.newBufferedReader(Path.of(inputString));
            String line;
            while ((line=bufferedReader.readLine())!=null){
                for (char element :
                        line.toCharArray()) {
                    //System.out.print(element);
                    if (element==inputChar) charCounter +=1;
                }

            }


        } catch (IOException ioException) {
            throw new IllegalArgumentException("Cannot read the file.");
        }


        return charCounter;
    }
}
