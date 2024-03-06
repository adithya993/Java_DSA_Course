package adi.practice.kunalkushwaha.pattern;

class PatternProblems {
    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern6(n);
        System.out.println();
        pattern7(n);
        System.out.println();
        pattern7a(n);
        System.out.println();
        pattern8(n);
        System.out.println();
        pattern8a(n);
        System.out.println();
        pattern9(n);
        System.out.println();
        pattern10(n);
        System.out.println();
    }

    public static void pattern1(int n) {
        System.out.println("Pattern 1");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        System.out.println("Pattern 2");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        System.out.println("Pattern 3");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        System.out.println("Pattern 4");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        System.out.println("Pattern 5");
        System.out.println();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        System.out.println("Pattern 6");
        System.out.println();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        System.out.println("Pattern 7");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i) + 1; j++) {
                System.out.print("* ");
            }
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void pattern7a(int n) {
        System.out.println("Pattern 7a");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i) + 1; j++) {
                System.out.print(j + " ");
            }
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        System.out.println("Pattern 8");
        System.out.println();
        for (int i = n; i > 0; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void pattern8a(int n) {
        System.out.println("Pattern 8a");
        System.out.println();
        for (int i = n; i > 0; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(j + " ");
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        System.out.println("Pattern 9");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i) + 1; j++) {
                System.out.print("* ");
            }
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        System.out.println("Pattern 10");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}