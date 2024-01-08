package com.myblog7.myblog7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//        List<String> names = Arrays.asList("mike", "nilay", "kamal", "jay", "nilay");
//        List<String> data1 = names.stream().filter(str -> str.startsWith("m")).collect(Collectors.toList());
//        List<String> data2 = names.stream().filter(str -> str.equals("nilay")).collect(Collectors.toList());
//        List<String> data3 = names.stream().filter(str -> str.endsWith("l")).collect(Collectors.toList());
//        System.out.println(data1);
//        System.out.println(data2);
//        System.out.println(data3);

        // find the length of given string
//       Function<String,Integer> val= str->str.length();
//        Integer res = val.apply("pankaj sir acadamy");
//        System.out.println(res);

        // add the value in given number & give the o/p
//        Function<Integer,Integer>val= i->i+10;
//        Integer result = val.apply(36);
//        System.out.println(result);

        // add value 25 in all given numbers
//        List<Integer> numbers = Arrays.asList(15, 25, 35, 45, 85);
//        List<Integer> result = numbers.stream().map(i -> i + 25).collect(Collectors.toList());
//        System.out.println(result);

        // i want all the names in upper case
//        List<String> names = Arrays.asList("mike", "nialy", "adam", "stallin");
//        List<String> res = names.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
//        List<String> res1 = names.stream().map(str -> str.toLowerCase()).collect(Collectors.toList());
//        System.out.println(res);
//        System.out.println(res1);

        // sort all number in ascending order
//        List<Integer> numbers = Arrays.asList(25, 15, 69, 45, 21, 35);
//        List<Integer> result1 = numbers.stream().sorted().collect(Collectors.toList());
//        System.out.println(result1);

        // remove all the duplicate numbers & sort the number in ascending order
        List<Integer> numbers = Arrays.asList(12, 45, 25, 5, 69, 45, 7, 75, 54, 43, 98, 10, 25, 75);
        List<Integer> result = numbers.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(result);

    }
}
