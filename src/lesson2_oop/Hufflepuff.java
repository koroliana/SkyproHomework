package lesson2_oop;

public class Hufflepuff extends Hogwarts{
    private int hardWorking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardWorking, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        if ((transgressionDistance>=0 && transgressionDistance<=100) && (hardWorking>=0 && hardWorking<=100)  &&
                (honesty>=0 && honesty<=100)) {
            this.hardWorking = hardWorking;
            this.loyalty = loyalty;
            this.honesty = honesty;
        }
        else throw new RuntimeException("Значение свойства характера должно быть от 0 до 100!");

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

    public void compareHufflepuffStudents(Hufflepuff student) {
        if ((this.getHardWorking()+this.getLoyalty()+this.getHonesty()) >
                (student.getHardWorking()+student.getLoyalty()+student.getHonesty())) {
            System.out.println(this.getName() + " - лучший Пуффендуец, чем " + student.getName());
        }
        else if ((this.getHardWorking()+this.getLoyalty()+this.getHonesty()) <
                (student.getHardWorking()+student.getLoyalty()+student.getHonesty())) {
            System.out.println(student.getName() + " - лучший Пуффендуец, чем " + this.getName());
        }
        else System.out.println(student.getName() + " и " + this.getName() + " - одинаково хорошие Пуффендуйцы" );
    }

}
