package lesson2_oop;

public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit; //остроумие
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
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

}
