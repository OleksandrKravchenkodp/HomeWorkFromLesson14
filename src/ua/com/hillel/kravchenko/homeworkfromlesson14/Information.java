package ua.com.hillel.kravchenko.homeworkwithcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
1. Создайте класс “Information”, у которого будет 3 переменных:

        1.1. Список псевдонимов пользователя(List) - тут будет храниться список строковых значений;

        1.2. Набор почт пользователя(Set) - тут будет храниться набор почт потенциальных пользователей.
        Данная коллекция обеспечит уникальность записей без дублей. Так же строковое значение;

        1.3. Мапа соотношений “почта-псевдоним” - тут будет записываться соотношение какой почте соответствует какой псевдоним.
        Почта является ключом Мапы!
*/
public class Information {

    //Я понимаю, что последующие три строки тут не должны быть, что все поля мы создаем через конструктор (как указано ниже),
    //но так я несмог понять как мне передать обект эттого класса в  методы класса InitializationData
    ArrayList<String> pseudonyms = new ArrayList<>();

    HashSet<String> emailsOfUsers = new HashSet<>();

    HashMap<HashSet<String>, ArrayList<String>> dataOfUsers = new HashMap<>();


    /*
    ArrayList<String> pseudonyms;

    HashSet<String> emailsOfUsers;

    HashMap<HashSet<String>, ArrayList<String>> dataOfUsers;
*/
    public Information() {
    }

    public Information(ArrayList<String> pseudonyms) {
        this.pseudonyms = pseudonyms;
    }

    public Information(ArrayList<String> pseudonyms, HashSet<String> emailsOfUsers,
                       HashMap<HashSet<String>, ArrayList<String>> dataOfUsers) {
        this.pseudonyms = pseudonyms;
        this.emailsOfUsers = emailsOfUsers;
        this.dataOfUsers = dataOfUsers;
    }
}
