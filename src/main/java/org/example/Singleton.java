package org.example;

public class Singleton {
    private static Singleton instance;
    private static float pi;

    private Singleton(float pi ){
    this.pi = pi;
    }
    public static Singleton getInstance(float pi ) {
        if (instance == null) {
            instance = new Singleton(pi);
        }
        return instance;
    }

    public static void getPi() {
        System.out.println(pi);
    }
}
