 class Class1 {
    static int a = 10, b = 20, c = 30, d = 40, e = 50;

    public void show() {
        int a = 100, b = 200, c = 300, d = 400, e = 500;

        System.out.println("Class1 - Static: " + Class1.a + ", " + Class1.b + ", " + Class1.c + ", " + Class1.d + ", " + Class1.e);
        System.out.println("Class1 - Local: " + a + ", " + b + ", " + c + ", " + d + ", " + e);
    }

    }

 class Class2 {
    static int a = 11, b = 22, c = 33, d = 44, e = 55;

    public void show() {
        int a = 111, b = 222, c = 333, d = 444, e = 555;

        System.out.println("Class2 - Static: " + Class2.a + ", " + Class2.b + ", " + Class2.c + ", " + Class2.d + ", " + Class2.e);
        System.out.println("Class2 - Local: " + a + ", " + b + ", " + c + ", " + d + ", " + e);
    }

    }

 class Class3 {
    static int a = 101, b = 201, c = 301, d = 401, e = 501;

    public void show() {
        int a = 1000, b = 2000, c = 3000, d = 4000, e = 5000;

        System.out.println("Class3 - Static: " + Class3.a + ", " + Class3.b + ", " + Class3.c + ", " + Class3.d + ", " + Class3.e);
        System.out.println("Class3 - Local: " + a + ", " + b + ", " + c + ", " + d + ", " + e);
    }

    }

 class Class4 {
    static int a = 5, b = 10, c = 15, d = 20, e = 25;

    public void show() {
        int a = 52, b = 105, c = 55, d = 21, e = 65;

        System.out.println("Class4 - Static: " + Class4.a + ", " + Class4.b + ", " + Class4.c + ", " + Class4.d + ", " + Class4.e);
        System.out.println("Class4 - Local: " + a + ", " + b + ", " + c + ", " + d + ", " + e);
    }

    }

 class Class5 {
    static int a = 7, b = 14, c = 21, d = 28, e = 35;

    public void show() {
        int a = 71, b = 124, c = 231, d = 128, e = 935;

        System.out.println("Class5 - Static: " + Class5.a + ", " + Class5.b + ", " + Class5.c + ", " + Class5.d + ", " + Class5.e);
        System.out.println("Class5 - Local: " + a + ", " + b + ", " + c + ", " + d + ", " + e);
    }
}

public class Returntype {
    public static void main(String[] args) {
        new Class1().show();

        new Class2().show();

        new Class3().show();

        new Class4().show();

        new Class5().show();
    }
}