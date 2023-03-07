package lesson2_oop;

public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 50, 13, 5, 10, 9);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 31, 30, 5, 5, 6);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 18, 15, 3, 6, 5);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой",29,31,27,31,40, 25,35);
        Slytherin grahamMontagu = new Slytherin("Грэхэм Монтегю",21,38,23,24,31, 11,29);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл",10, 11,2,8,13,2,25);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит",20,20,0,4,4);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори",45,30, 40,25,30);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли",11,13,20,10,15);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 28,25, 15,20,9,19);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил",25,15,18,9,12,23);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби",15,13,15,12,8,11);

        //Hufflepuff noki = new Hufflepuff("лподло", 15, 3, 0 ,0 ,120 );
        //Gryffindor lin = new Gryffindor("лподло", 15, 3, 100 ,0 ,6 );
        //Ravenclaw nil = new Ravenclaw("лподло", 15, 3, 100 ,0 ,6,800 );
        //Slytherin nik = new Slytherin("лподло", 15, 3, -100 ,0 ,6,8,5 );

        System.out.println(harryPotter);
        System.out.println(cedricDiggory);
        harryPotter.compareHogwartsStudents(dracoMalfoy);
        dracoMalfoy.compareHogwartsStudents(gregoryGoyle);
        harryPotter.compareHogwartsStudents(cedricDiggory);
        hermioneGranger.compareHogwartsStudents(zhouChang);
        ronWeasley.compareHogwartsStudents(zhouChang);
        zachariasSmith.compareHogwartsStudents(padmaPatil);
        justinFinchFletchley.compareHogwartsStudents(marcusBelby);
        System.out.println();
        ronWeasley.compareGryffindorStudents(hermioneGranger);
        gregoryGoyle.compareSlytherinStudents(grahamMontagu);
        grahamMontagu.compareSlytherinStudents(dracoMalfoy);
        cedricDiggory.compareHufflepuffStudents(justinFinchFletchley);
        marcusBelby.compareRavenclawStudents(padmaPatil);
        zhouChang.compareRavenclawStudents(padmaPatil);


    }
}
