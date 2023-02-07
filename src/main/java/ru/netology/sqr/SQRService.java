package ru.netology.sqr;

public class SQRService {
    public int calcSQR(int min, int max) {
        int result = 0;
        int i;
        for (i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    result++;
                }
            }
        }
        return result;
    }
}
