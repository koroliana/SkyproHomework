package course2.lesson1_memory;

public class Main {
    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println(value); // Задание 5: Ответ 33. Передавая в метод примитив, мы копируем его значение в другую переменную value, существующую только внутри метода. Изменения этой переменной внутри метода никак не влияют на первоначальную переменную. Чтобы переменная value в методе main изменила значение, недостаточно просто запустить метод, нужно присвоить ей значение, возвращаемое методом.

        Integer value2 = 33;
        changeValue(value2);
        System.out.println(value2); // Задание 6: Аналогичный ответ 33. Объекты хранятся по ссылке. Передавая в метод переменную value, мы копируем ссылку на объект Integer в памяти. Когда внутри метода присваиваем новой переменной другое значение, создается новый объект типа Integer и старая ссылка заменяется новой. Но это происходит только внутри метода. Снаружи, в методе main значение переменной value не изменяется.

        Integer[] value3 = {3,4};
        changeValue(value3);
        for (Integer number: value3) {
            System.out.print(number + " ");  // Задание 7: Ответ {3, 4}. Скопированная ссылка на массив из main, заменяется ссылкой на новый массив, созданный в методе. Первоначальный массив не изменяется.
        }
        System.out.println();

        changeValue2(value3);
        for (Integer number: value3) {
            System.out.print(number + " ");  // Задание 8: Ответ {99, 4}. Значение массива изменилось, так как внутри метода произошла замена самого значения ячейки массива по ссылке на неё.
        }
        System.out.println();

        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person); // Задание 9: Ответ Lyapis Trubetskoy. Значения не изменятся, так как никаких изменений с первоначальным объектом не произошло. Внутри метода был создан новый объект и переменной внутри метода присвоена ссылка на этот объект.

        changePerson2(person);
        System.out.println(person); // Задание 10: Ответ Ilya Lagutenko. Объект изменился, так как теперь в методе напрямую изменили значения полей объекта, получив доступ к ним по скопированной в метод ссылке.

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

    /*
    Задание 5

Ответ: 33.

Передавая в метод примитив, мы копируем его значение в другую переменную value, существующую только внутри метода. Изменения этой переменной внутри метода никак не влияют на первоначальную переменную. Чтобы переменная value в методе main изменила значение, недостаточно просто запустить метод, нужно присвоить ей значение, возвращаемое методом. Вот так:

public static void main(String[] args) {
    int value = 33;
    value = changeValue(value);
}

public static int changeValue(int value) {
    value = 22;
    return value;
}


Задание 6

Аналогичный ответ: 33.

Объекты хранятся по ссылке. Передавая в метод переменную value, мы копируем ссылку на объект Integer в памяти. Когда внутри метода присваиваем новой переменной другое значение, создается новый объект типа Integer и старая ссылка заменяется новой. Но это происходит только внутри метода. Снаружи, в методе main значение переменной value не изменяется.



Задание 7

Ответ: {3, 4}.

Скопированная ссылка на массив из main, заменяется ссылкой на новый массив, созданный в методе. Первоначальный массив не изменяется. Intellij IDEA не дает записать в методе

value = {1, 2};
Только вот так:

value = new Integer[]{1, 2};


Задание 8

Ответ: {99, 4}.

Значение массива изменилось, так как внутри метода произошла замена самого значения ячейки массива по ссылке на неё.

value[0] = 99;


Задание 9

Ответ: Lyapis Trubetskoy.

Значения имени и фамилии не изменились, так как никаких изменений с первоначальным объектом не произошло. Внутри метода был создан новый объект. И переменной, содержащей ссылку на первоначальный объект, была присвоена ссылка на новый объект.

person = new Person("Ilya", "Lagutenko");


Задание 10

Ответ: Ilya Lagutenko.

Объект изменился, так как теперь в методе напрямую изменили значения полей объекта, получив доступ к ним по скопированной в метод ссылке.

person.name ="Ilya";
person.surname = "Lagutenko";
     */


}
