package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide < 0 || secondSide < 0 || thirdSide < 0) {
            System.out.println("it's not a triangle");
            return;
        }

        double longest = firstSide > secondSide ? (firstSide > thirdSide ? firstSide : thirdSide) : (secondSide > thirdSide ? secondSide : thirdSide);

        String out = firstSide + secondSide + thirdSide > 2 * longest ? "this is a valid triangle" : "it's not a triangle";
        System.out.println(out);
    }

}
