package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {

    // ha Fish nem absztrakt, setMemoryLoss v két konstruktor kötelező lenne

    private String name;
    private int weight;
    private String color;
    private boolean memoryLoss;


    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public void setMemoryLoss(boolean memoryLoss) {
        this.memoryLoss = memoryLoss;
    }

    //mindegyik hal feed metódusa más, IDEA kéri és az @Override -ot is felajánlja

    public abstract void feed();

    public void increaseWeight(int inputIncrease) {
        this.weight += inputIncrease;
    }

    public String status(){
       return name + ", weight: " + weight + ", color: " + color + ", short term memory loss: " + memoryLoss;

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }
}
