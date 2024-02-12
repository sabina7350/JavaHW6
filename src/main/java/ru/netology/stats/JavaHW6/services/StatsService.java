package ru.netology.stats.JavaHW6.services;

import java.util.Arrays;

public class StatsService {
    public int allSum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
            System.out.println(sum);
        }
        return sum;
    }

    public int midSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        System.out.println(maxMonth + 1);
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        System.out.println(minMonth + 1);
        return minMonth + 1;
    }

    public int minMid(int[] sales) {
        int lessMid = midSum(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < lessMid) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public int maxMid(int[] sales) {
        int moreMid = midSum(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > moreMid) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}

