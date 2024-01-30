package com.myblog7.myblog7;

import java.util.*;
import java.util.stream.Collectors;

public class test_3 {
    public static void main(String[] args) {


        List<Employee> list = Arrays.asList(
                new Employee(1, "mike", 15000.0, 10),
                new Employee(2, "stallin", 12500.0, 20),
                new Employee(3, "adam", 12500.0, 10),
                new Employee(4, "jack", 9500.0, 20)
        );
        Map<Long, Optional<Employee>> collect = list.stream().collect(Collectors.groupingBy(emp -> emp.getDept_id(), Collectors.maxBy(Comparator.comparing(e -> e.getSalary()))));

        for (Map.Entry<Long, Optional<Employee>> entry : collect.entrySet()) {
            Long deptId = entry.getKey();

            System.out.println("deptId" + deptId + entry.getValue().get().getSalary());


        }
    }
}
