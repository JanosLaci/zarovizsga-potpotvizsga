package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DaVinciCode {
    public int encode(String inputString, char inputChar) {

        // &&, nem ||
        // konstans String, majd contains
        if (inputChar!='x' && inputChar!='1' && inputChar!='0'){
            throw new IllegalArgumentException("Invalid input."); }

        int charCounter=0;

        try {
            List<String> lines = Files.readAllLines(Path.of(inputString));
            //int charCountInLine = 0;
            for (String line :
                    lines) {
                for (char element :
                        line.toCharArray()) {
                    //System.out.print(element);
                    if (element==inputChar) charCounter +=1;
                }
            }

        } catch (IOException ioException) {
            throw new IllegalArgumentException("Cannot red the file.", ioException);
        }


        return charCounter;
    }
}
