package lesson2_oop;

public class Gryffindor extends Hogwarts{
    private int nobility; //благородство
    private int honor ;
    private int courage;

    // TODO: 28.02.2023 Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100.  

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;

    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return super.toString() + ", факультет: Гриффиндор, благородство: " + nobility +
                ", честь: " + honor + ", храбрость: " + courage  ;
    }

    public void compareGryffindorStudents(Gryffindor student) {
        if ((this.getNobility()+this.getHonor()+this.getCourage()) >
                (student.getNobility()+student.getHonor()+student.getCourage())) {
            System.out.println(this.getName() + " - лучший Гриффиндорец, чем " + student.getName());
        }
        else if ((this.getNobility()+this.getHonor()+this.getCourage()) <
                (student.getNobility()+student.getHonor()+student.getCourage())) {
            System.out.println(student.getName() + " - лучший Гриффиндорец, чем " + this.getName());
        }
        else System.out.println(student.getName() + " и " + this.getName() + " - одинаково хорошие Гриффиндорцы" );
    }

}



