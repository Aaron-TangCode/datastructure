package com.hailintang.array;

/**
 * @author Aaron
 * @date 2020-02-02 21:29
 * @function
 */
public class Teacher implements Comparable<Teacher> {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Teacher o) {
        return o.age-age;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
