package com.anandorja.learn;

public class PatternProgramming {
    public static void rightAngle(int a, String symbol) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

    }

    public static void leftAngle(int a, String symbol) {
        for (int i = 0; i < a; i++) {
            for (int j = a; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

    }

    public static void pyramidPattern(int a, int b) {
        for (int i = 1; i <= a; i++) {
            b = i - 1;
            for (int j = i; j <= a - 1; j++) {
                System.out.print(" ");
                System.out.print("  ");
            }
            for (int j = 0; j <= b; j++)
                System.out.print((i + j) < 10 ? (i + j) + "  " : (i + j) + " ");

            for (int j = 1; j <= b; j++)
                System.out.print((i + b - j) < 10 ? (i + b - j) + "  " : (i + b - j) + " ");
            System.out.println();
        }

    }

    public static void reversePyramid(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < a - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void upSidePart(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void downsidePart(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < a - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void downwardTriangle(int a) {
        for (int i = a - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void diamondPattern(int number) {
        for (int m = 1; m <= number; m++) {
            for (int n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m = number - 1; m > 0; m--) {
            for (int n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        rightAngle(5, "*");
        leftAngle(5, "#");
        pyramidPattern(5, 0);
        reversePyramid(5);
        upSidePart(5);
        downsidePart(5);
        downwardTriangle(7);
        diamondPattern(5);
    }
}
