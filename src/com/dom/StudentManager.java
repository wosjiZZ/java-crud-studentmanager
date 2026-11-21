package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    // 用 ArrayList 当“数据库”
    private static ArrayList<Student> list = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 提前放几条假数据，方便测试“查”的功能
        list.add(new Student("001", "张三", 18));
        list.add(new Student("002", "李四", 19));

        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生");
            System.out.println("4. 查看所有学生");
            System.out.println("5. 退出系统");
            System.out.print("请输入你的选择: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1": addStudent(); break;
                case "2": deleteStudent(); break;
                case "3": updateStudent(); break;
                case "4": showAllStudents(); break;
                case "5":
                    System.out.println("退出成功，欢迎下次使用！");
                    System.exit(0);
                default:
                    System.out.println("输入有误，请重新输入！");
            }
        }
    }

    // 1. 增 (Create)
    private static void addStudent() {
        System.out.print("请输入学号: ");
        String id = scanner.nextLine();
        System.out.print("请输入姓名: ");
        String name = scanner.nextLine();
        System.out.print("请输入年龄: ");
        int age = Integer.parseInt(scanner.nextLine());

        Student s = new Student(id, name, age);
        list.add(s);
        System.out.println("添加成功！");
    }

    // 2. 删 (Delete)
    private static void deleteStudent() {
        System.out.print("请输入要删除的学生学号: ");
        String id = scanner.nextLine();
        int index = getIndexById(id);

        if (index == -1) {
            System.out.println("没找到该学生！");
        } else {
            list.remove(index);
            System.out.println("删除成功！");
        }
    }

    // 3. 改 (Update)
    private static void updateStudent() {
        System.out.print("请输入要修改的学生学号: ");
        String id = scanner.nextLine();
        int index = getIndexById(id);

        if (index == -1) {
            System.out.println("没找到该学生！");
            return;
        }

        System.out.print("请输入新姓名: ");
        String name = scanner.nextLine();
        System.out.print("请输入新年龄: ");
        int age = Integer.parseInt(scanner.nextLine());

        // 修改对象属性
        Student s = list.get(index);
        s.setName(name);
        s.setAge(age);
        System.out.println("修改成功！");
    }

    // 4. 查 (Read)
    private static void showAllStudents() {
        if (list.isEmpty()) {
            System.out.println("当前没有任何学生信息，请先添加。");
            return;
        }
        System.out.println("学号\t姓名\t年龄");
        for (Student s : list) {
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge());
        }
    }

    // 辅助方法：根据学号找索引
    private static int getIndexById(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1; // 没找到返回 -1
    }
}