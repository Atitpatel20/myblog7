package com.myblog7.myblog7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("mike", 85, "A"),
                new Student("adam", 35, "D"),
                new Student("stallin", 65, "B"),
                new Student("sam", 95, "A+"),
                new Student("chetan", 75, "B+"),
                new Student("nilay", 55, "C")
        );
        Map<Integer, List<Student>> collect = students.stream().collect(Collectors.groupingBy(str -> str.getMarks()));

        for ( Map.Entry<Integer,List<Student>> entry: collect.entrySet()) {
            Integer marks = entry.getKey();
            List<Student> results = entry.getValue();
            System.out.println("marks:"+marks+"---");
            for (Student m : results) {
                System.out.println(m.getStudentName());
                System.out.println(m.getGrade());
            }

        }

    }

}

