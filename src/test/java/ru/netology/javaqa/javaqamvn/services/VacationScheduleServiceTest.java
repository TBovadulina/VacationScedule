package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// import ru.netology.javaqa.javaqamvn.services.VacationScheduleService;

public class VacationScheduleServiceTest {

    @Test
    void shouldCalculateForFirstExample() {
        VacationScheduleService service = new VacationScheduleService();

        // подготавливаем данные:
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForSecondExample() {
        VacationScheduleService service = new VacationScheduleService();

        // подготавливаем данные:
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int expected = 2;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
