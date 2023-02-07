package course1.objects;

public class Main {
    public static void main(String[] args) {
        Author agathaChristie = new Author("Агата", "Кристи");
        Author stephenFry = new Author("Стивен", "Фрай");
        Book makingHistory = new Book("Как творить историю", stephenFry, 2005);
        Book thereWereNone = new Book("Десять негритят", agathaChristie, 1939);
        Author author4 = new Author("Стивен", "Фрай");
        Book book3 = new Book("Как творить историю", author4, 2005);

        System.out.println(makingHistory);
        System.out.println(thereWereNone);
        makingHistory.setPublicationYear(1996);
        System.out.println(makingHistory);
        System.out.println();

        System.out.println(makingHistory.equals(thereWereNone));
        System.out.println(makingHistory.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(makingHistory.equals(book3));

    }
}
