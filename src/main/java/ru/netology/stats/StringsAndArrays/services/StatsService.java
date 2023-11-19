package ru.netology.stats.StringsAndArrays.services;

import java.lang.reflect.Array;

public class StatsService {
    public long finalAmount(long[] sales) {
        long summary = 0; // итоговая сумма

        for (int i = 0; i < sales.length; i++) {
            summary = summary + sales[i];
        }
        return summary;
    }

    public double averageSummPerMonth(long[] sales) {
        return finalAmount(sales) / sales.length; // используем уже посчитанную в прошлом методе итоговую сумму
    }

    public int monthWithMaxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце сумма продаж больше
                maxMonth = i; // запомним его как месяц с максимальной продажей
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthWithMinSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце сумма продаж меньше
                minMonth = i; // запомним его как месяц с максимальной продажей
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int countOfMonthBelowAverage(long[] sales) {
        int counter = 0;
        double averageSumm = averageSummPerMonth(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSumm) {
                counter++;
            }
        }
        return counter;
    }

    public int countOfMonthAboveAverage(long[] sales) {
        int counter = 0;
        double averageSumm = averageSummPerMonth(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSumm) {
                counter++;
            }
        }
        return counter;
    }
}
