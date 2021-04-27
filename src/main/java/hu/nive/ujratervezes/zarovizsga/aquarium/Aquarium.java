package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Aquarium {

    List<Fish> fishList = new ArrayList<>();

    public List<String> getStatus() {
        List<String> outPutList = new ArrayList<>();

        for (Fish fish :
                fishList) {
            outPutList.add(fish.status());
        }
        return outPutList;
    }

    public void addFish(Fish fishToBeAdded) {
        fishList.add(fishToBeAdded);
    }

    //removeFish(), eltávolít minden olyan halat az akváriumból, ami legalább 11 grammos
    // remove nem megengedett foreach közben!

    public void removeFish() {
        List<Fish> fishListToBeRemoved = new ArrayList<>();
        for (Fish fish :
                fishList) {
            if (fish.getWeight()>=11) fishListToBeRemoved.add(fish);
        }
        fishList.removeAll(fishListToBeRemoved);

    }

    public void feed() {
        for (Fish fish :
                fishList) {
            fish.feed();
        }

    }
}
