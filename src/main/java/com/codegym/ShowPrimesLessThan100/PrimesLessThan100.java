package com.codegym.ShowPrimesLessThan100;

public class PrimesLessThan100 {
    public static void main(String[] args) {

        int number = 2;
        StringBuilder show = new StringBuilder();

        while (number < 100) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                show.append(number).append("\t");
            }
            number++;
        }
        System.out.println("primes less than 100 are " + show);
    }

}
