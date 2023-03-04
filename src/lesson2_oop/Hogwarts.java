package lesson2_oop;

public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    // TODO: 28.02.2023  Сила магии и расстояние трансгресии у каждого ученика своё и выражается в целочисленном эквиваленте. Возможно, тоже до 100

    public Hogwarts(String name, int magicPower, int transgressionDistance){
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;

    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return name + ", сила магии: " + magicPower + ", расстояние трансгрессии: " + transgressionDistance;
    }
}
