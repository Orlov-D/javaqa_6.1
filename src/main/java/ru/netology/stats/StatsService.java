package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSumSales(long[] sales) {
        int averageSum = 0;
        for (long sale : sales) {
            averageSum += sale;
        }
        averageSum = averageSum / sales.length;
        return averageSum;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int amountBelowAverage(long[] sales) {
        int quantityOfMonth = 0;
//        int averageSum = 0;
//        for (long sale : sales) {
//            averageSum += sale;
//        }
//        averageSum = averageSum / sales.length;
        StatsService service = new StatsService();
        int averageSum = service.averageSumSales(sales);
        for (long sale : sales) {
            if (sale < averageSum) {
                quantityOfMonth++;
            }
        }
        return quantityOfMonth;
    }

    public int amountAboveAverage(long[] sales) {
        int quantityOfMonth = 0;
        int averageSum = this.averageSumSales(sales);
        for (long sale : sales) {
            if (sale > averageSum) {
                quantityOfMonth++;
            }
        }
        return quantityOfMonth;
    }
}
