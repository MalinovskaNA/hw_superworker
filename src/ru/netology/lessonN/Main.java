package ru.netology.lessonN;

public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        //Worker worker = new Worker(listener);
        //worker.start();

        Worker worker2 = new Worker(listener, errorListener);
        worker2.start(100, 33);
    }
}
