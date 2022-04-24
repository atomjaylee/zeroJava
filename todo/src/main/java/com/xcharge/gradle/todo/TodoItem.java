package com.xcharge.gradle.todo;

public class TodoItem {
    // 代办事项的名称
    private String name;

    // 已完成
    private boolean hasDone;

    public TodoItem(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDone() {
        return this.hasDone;
    }

    public void setHasDone(boolean hasDone) {
        this.hasDone = hasDone;
    }

    // 重写toString方法
    public String toString() {
        return name + (hasDone ? "hasDone" : "need to do") + "!";
    }
}
