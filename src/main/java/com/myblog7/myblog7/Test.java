package com.myblog7.myblog7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//        Predicate<Integer>val=y->y%2==0;
//        boolean test = val.test(25);
//        System.out.println(test);

//       Predicate<String>names= str->str.equals("sweet");
//        boolean res = names.test("ayush");
//        System.out.println(res);

//        List<Integer> numbers = Arrays.asList(15, 24, 36, 39, 31);
//        List<Integer> evenNum = numbers.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenNum);

//        List<Integer> numbers = Arrays.asList(14, 26, 34, 11, 15, 39, 41);
//        List<Integer> oddNum = numbers.stream().filter(s -> s % 2 != 0).collect(Collectors.toList());
//        System.out.println(oddNum);

        List<String> names = Arrays.asList("mike", "nilay", "kamal", "jay", "nilay");
        List<String> data1 = names.stream().filter(str -> str.startsWith("m")).collect(Collectors.toList());
        List<String> data2 = names.stream().filter(str -> str.equals("nilay")).collect(Collectors.toList());
        List<String> data3 = names.stream().filter(str -> str.endsWith("l")).collect(Collectors.toList());
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);


    }
}
