package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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

    public void removeFish1() {
        List<Fish> fishListToBeRemoved = new ArrayList<>();
        for (Fish fish :
                fishList) {
            if (fish.getWeight()>=11) fishListToBeRemoved.add(fish);
        }
        fishList.removeAll(fishListToBeRemoved);

    }


    public void removeFish() {
        Iterator<Fish> iterator = fishList.iterator();

        while (iterator.hasNext()){
            Fish actual = iterator.next();
            if (actual.getWeight()>=11){
                iterator.remove();
            }
        }


    }

    public void feed() {
        for (Fish fish :
                fishList) {
            fish.feed();
        }

    }
}
