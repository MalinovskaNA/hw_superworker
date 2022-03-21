package ru.netology.lessonN;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }


    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Task " + i + " is done");
        }
    }

    public void start(int countWorks, int errorWork) {
        for (int i = 1; i < countWorks + 1; i++) {
            if (i == errorWork) {
                errorCallback.onError("Error: Task " + errorWork + " is not done");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }

}
