package ua.com.hillel.kravchenko.homeworkwithcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
2. Создать класс “InitializationData” и метод внутри него, который будет предоставлять/наполнять данные для теста функционала.
Этот класс в итоге должен вернуть объект класса “Information”, с наполненными данными. Условия наполнения:

        2.1. Наполнить тридцатью уникальными значениями каждое из 3х полей класса “Information” (можно автоматически в цикле);

        2.2. Добавить в каждое поле класса “Information” 10 одинаковых значений
        (Будьте внимательны при наполнении Списка псевдонимов пользователя, так как эта коллекция не гарантирует
        уникальность значений);

        2.3. При возврате сущности “Information” созданного класса “InitializationData” необходимо,
        чтобы размер 3х полей был одинаковым(List.size() == Set.size() = Map.size()). Для данной проверки и корректировки,
        возможно, Вам понадобиться дополнительный внутренний(private) метод.
*/
public class InitializationData {

    Information information = new Information();

    void addInformationData() {
        int name = 1;
        String mail = "@gmail.com";

        for (int i = 0; i < 30; i++) {
            information.pseudonyms.add("Alex" + name);
            name++;
            information.emailsOfUsers.add(name + mail);
            information.dataOfUsers.put(information.emailsOfUsers, information.pseudonyms);
        }
    }

    Information informationFull() {
        String name = "John";
        String email = "john@gmail.com";

        for (int i = 0; i < 10; i++) {
            information.pseudonyms.add(name);
            information.emailsOfUsers.add(email);
            information.dataOfUsers.put(information.emailsOfUsers, information.pseudonyms);
            System.out.println(information.dataOfUsers);
        }
        checkCollections();
        return new Information(information.pseudonyms, information.emailsOfUsers, information.dataOfUsers);
    }


    private void checkCollections() {
        if (information.pseudonyms.size() == information.emailsOfUsers.size() &&
                information.pseudonyms.size() == information.dataOfUsers.size()) {
            System.out.println("Size collections is OK");
        } else if (information.emailsOfUsers.size() == information.dataOfUsers.size()) {
            System.out.println("Size collections is different");
            System.out.println("Size List is " + information.pseudonyms.size());
            System.out.println("Size Set is " + information.emailsOfUsers.size());
            System.out.println("Size Map is " + information.dataOfUsers.size());

            //тут я просто удаляю лишние элементы с конца, можно было усложнить и написать проверку на совпадение элементов
            //в коллекции и удалять те, что совпадают, но не думаю что нужно это поскольку я добавлял элементы в конец
            //коллекций, поэтому просто с конца лишние и удаляю.
            for (int i = information.pseudonyms.size(); i > information.emailsOfUsers.size(); i--) {
                information.pseudonyms.remove(i - 1);
            }

            System.out.println("-----------");

            System.out.println("Size List is " + information.pseudonyms.size());
            System.out.println("Size Set is " + information.emailsOfUsers.size());
            System.out.println("Size Map is " + information.dataOfUsers.size());
        }
    }

}
