package ru.netology.sqr.services;

public class SQRService {
    public int calcSqr(int min, int max) {
        int x = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= min) && (i * i <= max)) {
                x++;
            }
        }
        return x;
    }
}
