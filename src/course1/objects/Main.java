package course1.objects;

public class Main {
    public static void main(String[] args) {
        Author agathaChristie = new Author("Агата", "Кристи");
        Author stephenFry = new Author("Стивен", "Фрай");
        Book makingHistory = new Book("Как творить историю", stephenFry, 2005);
        Book thereWereNone = new Book("Десять негритят", agathaChristie, 1939);

        System.out.println(makingHistory);
        System.out.println(thereWereNone);

        makingHistory.setPublicationYear(1996);

        System.out.println(makingHistory);

    }
}
