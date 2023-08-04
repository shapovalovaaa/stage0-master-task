package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }

        int result = dividend / divider;
        int dividentNew = result * divider;

        int flag = dividentNew == dividend ? 1 : 2;
        switch (flag) {
            case 1:
                System.out.println("can be divided completely");
                break;
            case 2:
                System.out.println("cannot be divided completely");
                break;
        }
    }

}
