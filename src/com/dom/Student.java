package com.demo;

public class Student {
    private String id;      // 学号
    private String name;    // 姓名
    private int age;        // 年龄

    // 构造函数
    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // 快捷键：Alt + Insert (或右键 Generate) -> Getter and Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // 重写 toString，方便打印输出
    @Override
    public String toString() {
        return "学号: " + id + ", 姓名: " + name + ", 年龄: " + age;
    }
}