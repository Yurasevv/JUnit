package com.epam.junit;

public class Lesson3 {

        public boolean calculateSum(int n) {

            if (n / 1000 + n / 100 % 10 == n % 10 + n % 100 / 10) {
                return true;
            }
            return false;
        }
}
