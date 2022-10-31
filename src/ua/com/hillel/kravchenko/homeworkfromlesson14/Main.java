package ua.com.hillel.kravchenko.homeworkwithcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
3. В классе Main создайте еще один дополнительный внутренний метод,
        который на вход будет принимать 2 параметра (1- список из любых числовых оберток примитивов(Byte, Integer….),
        тут необходимо подумать про wildcards; 2-полученная переменная “Information”), и возвращать он будет
         обработанный “Information”. В этом методе необходимо написать следующую логику:

        3.1. пройтись по всему списку переданному и преобразовав значение в строку записать в список псевдонимов пользователя;

        3.2. Далее к данному значению добавить какое-нибудь заданное значение(например: @mail.ua)
        и записать в набор почт пользователя и Мапу их соотношения;

        3.3. Так же необходимо реализовать проверку уже существующей почты в наборе и не
        записывать данное значение в случае совпадения
*/

public class Main {
    static Information information = new Information();

    static void lastChangeInformation(ArrayList<? extends Number> numbers, Information information) {
        String mailDomain = "@mail.ua";
        for (int i = 0; i < numbers.size(); i++) {
            Main.information.pseudonyms.add(String.valueOf(numbers));
            if (information.emailsOfUsers.contains(String.valueOf(numbers) + mailDomain)) {
                continue;
            } else {
                Main.information.emailsOfUsers.add(String.valueOf(numbers) + mailDomain);
            }
            Main.information.dataOfUsers.put(Main.information.emailsOfUsers, Main.information.pseudonyms);
        }

        for (int i = 0; i < Main.information.dataOfUsers.size(); i++) {
            System.out.println(Main.information.dataOfUsers);
        }
        //return new Information(information.pseudonyms, information.emailsOfUsers, information.dataOfUsers);
    }


    public static void main(String[] args) {
        /*
4. В этом же классе Main в методе запуска программы необходимо написать логику работы всей системы:

        4.1. вызовите InitializationData, который в свою очередь создаст,
         наполнит и вернет объект Information со всеми значениями;

*/
        InitializationData init = new InitializationData();
        init.addInformationData();
        init.informationFull();

        //4.2. Далее создайте Список с какими-то обертками примитивов(пару значений достаточно);

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);


        //4.3. Вызовите дополнительный созданный метод Main и передайте все необходимое - убедитесь что все работает.

        //4.4. Выведите полученный результат в консоль.

        lastChangeInformation(ints, information);

    }
}
