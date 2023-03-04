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

    public int getCunning() {
        return cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public int getAmbition(){
        return ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + ", факультет: Слизерин, хитрость: " + cunning + ", решительность: " + determination +
                ", амбициозность: "+ ambition + ", находчивость: " + resourcefulness + ", жажда власти: " + lustForPower;
    }

    public void compareSlytherinStudents(Slytherin student) {
        if ((this.getCunning()+this.getDetermination()+this.getAmbition()+this.getResourcefulness()+this.getLustForPower()) >
                (student.getCunning()+student.getDetermination()+student.getAmbition()+student.getResourcefulness()+student.getLustForPower())) {

            System.out.println(this.getName() + " - лучший Слизеринец, чем " + student.getName());
        }
        else if ((this.getCunning()+this.getDetermination()+this.getAmbition()+this.getResourcefulness()+this.getLustForPower()) <
                (student.getCunning()+student.getDetermination()+student.getAmbition()+student.getResourcefulness()+student.getLustForPower())) {
            System.out.println(student.getName() + " - лучший Слизеринец, чем " + this.getName());
        }
        else System.out.println(student.getName() + " и " + this.getName() + " - одинаково хорошие Слизеринцы" );
    }
}
