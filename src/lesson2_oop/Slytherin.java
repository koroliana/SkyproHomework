package lesson2_oop;

public class Slytherin extends Hogwarts{
    private int cunning; //хитрость
    private int determination; //решительность
    private int ambition;
    private int resourcefulness; //находчивость
    private int lustForPower;


    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        if ((cunning>=0 && cunning<=100) && (determination>=0 && determination<=100)  && (ambition>=0 && ambition<=100) &&
        (resourcefulness>=0 && resourcefulness<=100) && (lustForPower>=0 && lustForPower<=100)){
            this.cunning = cunning;
            this.determination = determination;
            this.ambition = ambition;
            this.resourcefulness = resourcefulness;
            this.lustForPower = lustForPower;
        }
        else throw new RuntimeException("Значение свойства характера должно быть от 0 до 100!");

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
