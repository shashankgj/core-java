class Alpha {
    static int a = 10, b = 20, c = 30, d = 40, e = 50;

    static void printStatic() {
        System.out.println("Alpha static: " + a + " " + b + " " + c + " " + d + " " + e);
    }

    void printLocal() {
        int a = 1, b = 2, c = 3, d = 4, e = 5;
        System.out.println("Alpha local: " + a + " " + b + " " + c + " " + d + " " + e);
    }
}

class Beta {
    static int a = 11, b = 21, c = 31, d = 41, e = 51;

    static void printStatic() {
        System.out.println("Beta static: " + a + " " + b + " " + c + " " + d + " " + e);
    }

    void printLocal() {
        int a = 6, b = 7, c = 8, d = 9, e = 10;
        System.out.println("Beta local: " + a + " " + b + " " + c + " " + d + " " + e);
    }
}

class Gamma {
    static int a = 12, b = 22, c = 32, d = 42, e = 52;

    static void printStatic() {
        System.out.println("Gamma static: " + a + " " + b + " " + c + " " + d + " " + e);
    }

    void printLocal() {
        int a = 11, b = 12, c = 13, d = 14, e = 15;
        System.out.println("Gamma local: " + a + " " + b + " " + c + " " + d + " " + e);
    }
}

class Delta {
    static int a = 13, b = 23, c = 33, d = 43, e = 53;

    static void printStatic() {
        System.out.println("Delta static: " + a + " " + b + " " + c + " " + d + " " + e);
    }

    void printLocal() {
        int a = 16, b = 17, c = 18, d = 19, e = 20;
        System.out.println("Delta local: " + a + " " + b + " " + c + " " + d + " " + e);
    }
}

class Epsilon {
    static int a = 14, b = 24, c = 34, d = 44, e = 54;

    static void printStatic() {
        System.out.println("Epsilon static: " + a + " " + b + " " + c + " " + d + " " + e);
    }

    void printLocal() {
        int a = 21, b = 22, c = 23, d = 24, e = 25;
        System.out.println("Epsilon local: " + a + " " + b + " " + c + " " + d + " " + e);
    }
}

public class Variabledemo {
    public static void main(String[] args) {
        Alpha alpha = new Alpha();
        alpha.printLocal();
        Alpha.printStatic();

        Beta beta = new Beta();
        beta.printLocal();
        Beta.printStatic();

        Gamma gamma = new Gamma();
        gamma.printLocal();
        Gamma.printStatic();

        Delta delta = new Delta();
        delta.printLocal();
        Delta.printStatic();

        Epsilon epsilon = new Epsilon();
        epsilon.printLocal();
        Epsilon.printStatic();
    }
}
