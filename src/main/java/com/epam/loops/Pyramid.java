package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for(int i = 0; i < cathetusLength; i++)
        {
            for(int j = 0; j < cathetusLength - i - 1; j++)
            {
                System.out.print(' ');
            }
            for(int j = cathetusLength - i - 1; j < cathetusLength; j++)
            {
                System.out.print(cathetusLength - j);
            }
            for(int j = cathetusLength; j < cathetusLength + i; j++)
            {
                System.out.print(j - cathetusLength + 2);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
