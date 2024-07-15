package ru.netology.services;

public class MonthsService {
    public int calculate(int income, int expenses, int threshold) {
        int months = 0;
        int money = 0;
        for (int i = 0; i < 12; i++) {
            if (money < threshold) { // можем ли отдыхать?
                money = money + income;
                money = money - expenses;
            } else {
                money = money - expenses;
                money /= 3;
                months++;
            }
        }
        return months;
    }
}