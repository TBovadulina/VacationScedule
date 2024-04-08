package ru.netology.javaqa.javaqamvn.services;

public class VacationScheduleService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; //счетчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем отдыхать
                count++; // увеличиваем счетчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = (money + income) - expenses;
            }
        }
        return count;
    }
}

