# 学生管理系统 (Java CRUD Demo)

## 项目简介
这是我学习 Java 以来完成的第一个完整练习项目。实现了基于控制台的学生信息管理，包含基础的增删改查（CRUD）功能。

## 技术栈
- Java (JDK 17)
- 集合框架 (ArrayList)
- 面向对象编程

## 核心功能
 添加学生（支持学号、姓名、年龄录入）
 查询所有学生（格式化表格输出）
 根据学号删除学生（带防错校验）
 根据学号修改学生信息

## 运行方式
1. 克隆代码到本地。
2. 使用 IDEA 运行 `StudentManager.java` 的 main 方法。

## 复盘与总结 (Review)
### 1. 踩过的坑
- 一开始用 `==` 来比较字符串（学号），发现永远进不去判断。查阅资料后了解到 Java 中比较字符串内容必须用 `.equals()` 方法。
- 接收年龄时，用 `scanner.nextInt()` 后，再调用 `scanner.nextLine()` 会跳过输入。后来改用 `Integer.parseInt(scanner.nextLine())` 解决了这个“吞回车”的问题。

### 2. 收获
- 深刻理解了面向对象（将学生封装为类）。
- 熟悉了 IDEA 的快捷键使用（如 Alt+Insert 生成 Getter/Setter）。
- 掌握了 Git 的初步工作流：init -> add -> commit -> push。

### 3. 下一步计划
1.接入 MySQL 数据库，使用 JDBC 将数据持久化，而不是存在内存里。
2.增加异常处理（比如年龄输入字母会崩溃，需要加 try-catch）。
