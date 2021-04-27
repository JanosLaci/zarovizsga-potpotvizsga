package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Tang extends Fish {

    // tévút - ehelyett metódus létrehozása az absztrakt szülő osztályban a beállításra, és konstruktorban hívni
    // vagy: szülő konstruktorában memoryLoss, és itt konstruktorban beállítani
    // private final boolean memoryLoss = true;

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
        setMemoryLoss(true);
    }

    @Override
    public void feed() {
        this.increaseWeight(1);

    }
}
