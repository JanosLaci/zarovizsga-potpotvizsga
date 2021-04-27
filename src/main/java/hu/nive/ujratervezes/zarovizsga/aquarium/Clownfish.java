package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Clownfish extends Fish {

    //private final boolean memoryLoss = false;

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
        setMemoryLoss(false);
    }

    @Override
    public void feed() {
        this.increaseWeight(1);

    }
}
