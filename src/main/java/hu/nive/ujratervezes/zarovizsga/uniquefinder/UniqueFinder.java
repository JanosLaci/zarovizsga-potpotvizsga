package hu.nive.ujratervezes.zarovizsga.uniquefinder;

//Hozd létre a UniqueFinder osztályt, és abban a uniqueChars metódust,
// ami paraméternek kap egy String-et, és térjen vissza az abban levő karakterek listájával.
//Minden karakter csak egyszer szerepeljen a listában, az inputban nézett első előfordulásának megfelelő helyen.
//Ha a metódus null-t kap paraméterben, akkor dobj IllegalArgumentException-t!

import java.util.*;

public class UniqueFinder {
    public List<Character> uniqueChars(String inputString) {

        if (inputString == null) throw new IllegalArgumentException("No input received.");



        //Tévút:
        //List<String> splitString = Arrays.asList(inputString.split(""));
        //List<Character> outputList = new ArrayList<Character>(Arrays.asList(inputString.toCharArray()));

        //List megoldás:
       /* List<Character> outputList = new ArrayList<>();

        for (char element :
                inputString.toCharArray()) {
            if (!outputList.contains(element)) outputList.add(element);
        }*/

        Set<Character> setOfChars = new LinkedHashSet<>();

        for (char element :
                inputString.toCharArray()) {
            setOfChars.add(element);
        }

        //Nem lehet így, helyette  new ArrayList<>(result):
        // List<Character> outputList = (List<Character>) setOfChars;

        return new ArrayList<>(setOfChars);
    }
}
