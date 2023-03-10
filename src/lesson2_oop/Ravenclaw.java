package lesson2_oop;

public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit; //остроумие
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        if ((mind>=0 && mind<=100) && (wisdom>=0 && wisdom<=100)  &&
                (wit>=0 && wit<=100) && (creativity>=0 && creativity<=100)){
            this.mind = mind;
            this.wisdom = wisdom;
            this.wit = wit;
            this.creativity = creativity;
        }
        else throw new RuntimeException("Значение свойства характера должно быть от 0 до 100!");
    }

    public int getMind() {
        return mind;
    }
    public int getWisdom() {
        return wisdom;
    }
    public int getWit() {
        return wit;
    }
    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return super.toString() + ", факультет: Когтевран, ум: " + mind +
                ", мудрость: " + wisdom + ", остроумие: "+ wit + ", творчество: " + creativity;
    }

    public void compareRavenclawStudents(Ravenclaw student) {
        if ((this.getMind()+this.getWisdom()+this.getWit()+this.getCreativity()) >
                (student.getMind()+student.getWisdom()+student.getWit()+student.getCreativity())) {
            System.out.println(this.getName() + " - лучший Когтевранец, чем " + student.getName());
        }
        else if (((this.getMind()+this.getWisdom()+this.getWit()+this.getCreativity()) <
                (student.getMind()+student.getWisdom()+student.getWit()+student.getCreativity()))) {
            System.out.println(student.getName() + " - лучший Когтевранец, чем " + this.getName());
        }
        else System.out.println(student.getName() + " и " + this.getName() + " - одинаково хорошие Когтевранцы" );
    }

}
