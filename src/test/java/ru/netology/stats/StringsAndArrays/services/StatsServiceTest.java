package ru.netology.stats.StringsAndArrays.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    // @ParameterizedTest
    // @CsvFileSource(files = "src/test/resources/ListOfSales.csv")*/
    @Test
    public void SummaryOfSales() {
        StatsService service = new StatsService();

        long expected = 180;

        Assertions.assertEquals(expected, service.finalAmount(sales));
        System.out.println("Сумма всех продаж за месяц составила: " + service.finalAmount(sales) + " руб.");
        //System.out.println();
    }

    @Test
    public void AverageSummPerMonth() {
        StatsService service = new StatsService();
        //long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        Assertions.assertEquals(expected, service.AverageSummPerMonth(sales));
        System.out.println("Средняя сумма продаж за месяц равна: " + service.AverageSummPerMonth(sales) + " руб.");
        }

    @Test
    public void MonthWithMaxSumm() {
        StatsService service = new StatsService();
        //long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        Assertions.assertEquals(expected, service.monthWithMaxSales(sales));
        System.out.println("Номер месяца, в котором были продажи на максимальную сумму: " + service.monthWithMaxSales(sales));
    }

    @Test
    public void MonthWithMinSumm() {
        StatsService service = new StatsService();
        // long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        Assertions.assertEquals(expected, service.monthWithMinSales(sales));
        System.out.println("Номер месяца, в котором были продажи на минимальную сумму: " + service.monthWithMinSales(sales));
    }

    @Test
    public void countOfMonthWithSummBelowAverage() {
        StatsService service = new StatsService();
        // long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        Assertions.assertEquals(expected, service.countOfMonthBelowAverage(sales));
        System.out.println("Количество месяцев, в котором продажи были ниже среднего: " + service.countOfMonthBelowAverage(sales));
    }

    @Test
    public void countOfMonthWithSummAboveAverage() {
        StatsService service = new StatsService();
        // long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        Assertions.assertEquals(expected, service.countOfMonthAboveAverage(sales));
        System.out.println("Количество месяцев, в котором продажи были выше среднего: " + service.countOfMonthAboveAverage(sales));
    }
}
