package org.lesson.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("hello");
        System.out.println(singleton.getData());

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getData());

        SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstance("hello");
        System.out.println(singletonThreadSafe.getData());

        SingletonThreadSafe singletonThreadSafe1 = SingletonThreadSafe.getInstance();
        System.out.println(singletonThreadSafe1.getData());
    }
}
