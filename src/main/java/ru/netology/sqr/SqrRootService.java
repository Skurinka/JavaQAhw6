package ru.netology.sqr;


public class SqrRootService {

    public int calcSqrt(int dia1, int dia2) {
        int sum = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= dia1 && i * i <= dia2) {
               sum = sum + 1;
            }
        }
        return sum;
    }
}




