package ru.netology.sqr;

public class SQRService {

    public int calculate(int underLimit, int upperLimit) {
        int sum = 0;
        if (underLimit <= upperLimit) {
            for (int i = 10; i <= 99; i++) {
                int sqr = i * i;
                if (sqr > upperLimit) {
                    i = i + 100;
                } else if (underLimit <= sqr && sqr <= upperLimit) {
                    sum++;
                }
            }
        }
        return sum;
    }
}