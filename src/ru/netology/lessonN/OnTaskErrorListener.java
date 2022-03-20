package ru.netology.lessonN;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
