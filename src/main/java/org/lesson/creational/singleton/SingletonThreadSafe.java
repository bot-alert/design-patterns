package org.lesson.creational.singleton;

public class SingletonThreadSafe {
    private static volatile SingletonThreadSafe instance;
    private String data;

    private SingletonThreadSafe(String data) {
        this.data = data;
    }

    public static SingletonThreadSafe getInstance(String data) {
        SingletonThreadSafe result = instance;
        if (result == null) {
            synchronized (SingletonThreadSafe.class) {
                result = instance;
                if (result == null) {
                    instance = result = new SingletonThreadSafe(data);
                }
            }
        }
        return result;
    }

    public static SingletonThreadSafe getInstance() {
        return instance;
    }

    public String getData() {
        return data;
    }
}
