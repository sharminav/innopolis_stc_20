package ru.innopolis.university;

/**
 * @author Алексей Шармин
 * Программа сортирует массивы различными без способами без конвертации в списки
 * Результат выполнения: сортированные массивы, время выполнения каждого алгоритма, случайные элменты из массивов для сравнения результатов сортировки
 */
public class ht2t3 {

    public static void main(String[] args) throws Exception {
        ht2t3Person[] persons;
        ht2t3Person[] persons1;
        int maxCount = 100000;
        persons = new ht2t3Person[maxCount];
        persons1 = new ht2t3Person[maxCount];

        // Подготовка тестовых данных
        String[] girlName = new String[4];
        girlName[0] = "Маша";
        girlName[1] = "Даша";
        girlName[2] = "Олеся";
        girlName[3] = "Ольга";

        String[] boyName = new String[4];
        boyName[0] = "Иван";
        boyName[1] = "Станислав";
        boyName[2] = "Олег";
        boyName[3] = "Владимир";

        Integer[] testPosition = new Integer[4];
        testPosition[0] = (int) (Math.random() * maxCount);
        testPosition[1] = (int) (Math.random() * maxCount);
        testPosition[2] = (int) (Math.random() * maxCount);
        testPosition[3] = (int) (Math.random() * maxCount);


        // Заполнение случайными данными
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new ht2t3Person();
            persons[i].age = (int) (Math.random() * 100);
            int sexGenerate = (int) (Math.random() * 2);
            if (sexGenerate == 1) {
                persons[i].sex = ht2t3Sex.sex.MEN;
                persons[i].name = boyName[(int) (Math.random() * 3)];
            } else {
                persons[i].sex = ht2t3Sex.sex.WOMEN;
                persons[i].name = girlName[(int) (Math.random() * 3)];
            }
        }

        //PrintArray(persons);

        // Проверка на совпадения
        //FindEquals(persons);

        // Копирование массива
        persons1 = persons.clone();

        ht2t3SortBubble.order(persons);
        ht2t3SortInsert.order(persons1);

        // Тестирование сортировок для сравнения результатов
        // 4 случайных позиции
        PrintTest(persons, persons1, testPosition);

    }

    static void PrintArray(ht2t3Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            System.out.println(i + " - " + persons[i].sex.toString() + " - " + persons[i].age.toString() + " - " + persons[i].name.toString());
        }
    }

    static void PrintTest(ht2t3Person[] persons, ht2t3Person[] persons1, Integer[] testPosition)
    {
        for (int i = 0; i < testPosition.length; i++) {
            System.out.println(testPosition[i] + " - " + persons[testPosition[i]].sex.toString() + " - " + persons[testPosition[i]].age.toString() + " - " + persons[testPosition[i]].name.toString());
            System.out.println(testPosition[i] + " - " + persons1[testPosition[i]].sex.toString() + " - " + persons1[testPosition[i]].age.toString() + " - " + persons1[testPosition[i]].name.toString());
            System.out.println();
        }
    }

    static void FindEquals(ht2t3Person[] persons) throws Exception {
        for (var i = 0; i < persons.length; i++){
            for (var j = i + 1; j < persons.length; j++) {
                if ((persons[i].age.toString() + persons[i].name.toString()).compareTo((persons[j].age.toString() + persons[j].name.toString())) ==0 ) {
                    throw new Exception("Совпадающие элементы " + i + " и " + j);
                }
            }
        }
    }
}
