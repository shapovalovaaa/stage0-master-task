package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (month < 1 || month > 12 || year < 1)
        {
            System.out.println("invalid date");
            return;
        }

        boolean leap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0  ? true : false;

        if (month == 2)
        {
            int febDays = leap ? 29 : 28;
            System.out.println(febDays);
        }
        else if ((month <= 7 && month % 2 == 1) || (month >= 8 && month % 2 == 0))
            System.out.println(31);
        else
            System.out.println(30);
    }

}
