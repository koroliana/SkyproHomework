package lesson2_oop;

public class Slytherin extends Hogwarts{
    private int cunning; //хитрость
    private int determination; //решительность
    private int ambition;
    private int resourcefulness; //находчивость
    private int lustForPower;


    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + ", факультет: Слизерин, хитрость: " + cunning + ", решительность: " + determination +
                ", амбициозность: "+ ambition + ", находчивость: " + resourcefulness + ", жажда власти: " + lustForPower;
    }
}
