package hu.nive.ujratervezes.zarovizsga.uniquefinder;

//Hozd létre a UniqueFinder osztályt, és abban a uniqueChars metódust,
// ami paraméternek kap egy String-et, és térjen vissza az abban levő karakterek listájával.
//Minden karakter csak egyszer szerepeljen a listában, az inputban nézett első előfordulásának megfelelő helyen.
//Ha a metódus null-t kap paraméterben, akkor dobj IllegalArgumentException-t!

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueFinder {
    public List<Character> uniqueChars(String inputString) {

        if (inputString == null) throw new IllegalArgumentException("No input received.");

        List<Character> outputList = new ArrayList<>();

        //Tévút:
        //List<String> splitString = Arrays.asList(inputString.split(""));
        //List<Character> outputList = new ArrayList<Character>(Arrays.asList(inputString.toCharArray()));


        for (char element :
                inputString.toCharArray()) {
            if (!outputList.contains(element)) outputList.add(element);
        }

        return outputList;
    }
}
