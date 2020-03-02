package com.hailintang.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Aaron
 * @date 2020-02-02 20:58
 * @function
 */
public class MyComparator {
    public static class Student {
        public String name;
        public int id;
        public int age;

        public Student(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }
    }

    /**
     * id从小到大
     */
    public static class IdAscComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.id-o2.id;
        }
    }

    /**
     * id从大到小
     */
    public static class IdDescComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id-o1.id;
        }
    }


    /**
     * 按id从小到大排序，id相同，按照age从小到大排序
     */
    public static class IdAgeComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            if(o1.id!=o2.id){
                return o1.id - o2.id;
            }
            return o1.age-o2.age;
        }
    }

    public static class AgeAscComparator implements Comparator<Teacher>{

        @Override
        public int compare(Teacher o1, Teacher o2) {
            return o1.getAge()-o2.getAge();
        }
    }
    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("Name : " + student.name + ", Id : " + student.id + ", Age : " + student.age);
        }
    }
    public static void printTeacher(Teacher[] teachers) {
        for (Teacher teacher : teachers) {
            System.out.println("Name : " + teacher.getName() + ", Age : " + teacher.getAge());
        }
    }
    public static void main(String[] args) {
//        Student student1 = new Student("A", 2, 23);
//        Student student2 = new Student("B", 3, 21);
//        Student student3 = new Student("C", 1, 22);
//        Student student4 = new Student("D", 3, 22);
//        Student student5 = new Student("E", 2, 22);
//        Student student6 = new Student("F", 1, 21);
//        Student student7 = new Student("G", 5, 22);
//        Student student8 = new Student("H", 4, 26);
//        Student student9 = new Student("I", 1, 28);
//        Student[] arr = new Student[]{student1,
//                student2,student3,
//                student4,student5,
//                student6,student7,
//                student8,student9
//                };
//        System.out.println("id升序");
//        Arrays.sort(arr,new IdAscComparator());
//        printStudents(arr);
//        System.out.println("id降序");
//        Arrays.sort(arr,new IdDescComparator());
//        printStudents(arr);
//        System.out.println("id升序，id相同，根据age升序");
//        Arrays.sort(arr,new IdAgeComparator());
//        printStudents(arr);
        Teacher teacher1 = new Teacher("A",110);
        Teacher teacher2 = new Teacher("B",22);
        Teacher teacher3 = new Teacher("C",21);
        Teacher teacher4 = new Teacher("D",28);
        Teacher teacher5 = new Teacher("E",18);
        Teacher teacher6 = new Teacher("F",62);
        Teacher teacher7 = new Teacher("G",90);

        Teacher[] arr = new Teacher[]{
                teacher1,
                teacher2,
                teacher3,
                teacher4,
                teacher5,
                teacher6,
                teacher7
        };
        Arrays.sort(arr);
        printTeacher(arr);
    }
}
