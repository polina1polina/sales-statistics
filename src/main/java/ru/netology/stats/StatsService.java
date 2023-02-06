package ru.netology.stats;

public class StatsService {
    public int sumSales(long[] sales) {
        int sum = 0;
        for (long element : sales)
            sum += element;
        return sum++;
    }

    public int averageSum(long[] sales) {

        return sumSales(sales) / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        int numberOfSales = 0;
        int month = 0;
        for (long belowSales : sales) {
            if (belowSales < averageSum(sales)) {
                numberOfSales = month++;
            }
            numberOfSales = month;
        }
        return numberOfSales;

    }

    public int aboveAverageSales(long[] sales) {
        int numberOfSales = 0;
        int month = 0;
        for (long aboveSales : sales) {
            if (aboveSales > averageSum(sales)) {
                numberOfSales = month++;
            }
            numberOfSales = month;
        }
        return numberOfSales;
    }
}
