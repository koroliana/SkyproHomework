package course2.lesson1_memory;

public class Main {
    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println(value); // Задание 5: При распечатывании переменной в методе main ответ будет 33. Так как присваивание внутри метода произошло другой переменной value, доступной только внутри метода. Чтобы переменная в main изменила своё значение необходимо помимо запуска метода ещё добавить присваивание этой переменной результата отработки метода.

        Integer value2 = 33;
        changeValue(value2);
        System.out.println(value2); // Задание 6: Аналогичный ответ 33. Но в чем разница между ссылочной переменной и примитивом? тут бы нужно сказать

        Integer[] value3 = {3,4};
        changeValue(value3);
        for (Integer number: value3) {
            System.out.print(number + " ");  // Задание 7: Значением массива останется 3 и 4, аналогично
        }
        System.out.println();

        changeValue2(value3);
        for (Integer number: value3) {
            System.out.print(number + " ");  // Задание 8: 99 и 4. Значением массива изменится, так как в методе было заменено само значение ячейки.
        }
        System.out.println();

        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person); // Задание 9: Lyapis Trubetskoy. Значения не изменятся, так как никаких изменений с первоначальным объектом не произошло

        changePerson2(person);
        System.out.println(person); // Задание 10: Ilya Lagutenko. Значения изменятся, так как теперь в методе напрямую меняем значения полей объекта.

    }

    public static int changeValue(int value) {
        value = 22;
        return value;
    }

    public static Integer changeValue(Integer value) {
        value = 22;
        return value;
    }

    public static Integer[] changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
        return value;
    }

    public static Integer[] changeValue2(Integer[] value) {
        value[0] = 99;
        return value;
    }

    public static Person changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
        return person;
    }

    public static Person changePerson2(Person person) {
        person.name ="Ilya";
        person.surname = "Lagutenko";
        return person;
    }



}
