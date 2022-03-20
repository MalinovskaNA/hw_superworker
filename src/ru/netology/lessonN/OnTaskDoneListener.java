package ru.netology.lessonN;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
