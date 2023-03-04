package lesson2_oop;

public class Hufflepuff extends Hogwarts{
    private int hardWorking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardWorking, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardWorking = hardWorking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWorking() {
        return hardWorking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() + ", факультет: Пуффендуй, трудолюбие: " + hardWorking +
                ", преданность: " + loyalty + ", честность: " + honesty;
    }

}
