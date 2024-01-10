package com.myblog7.myblog7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer>val= number-> System.out.println(number);
        val.accept(26);

        List<String> names = Arrays.asList("akash", "sagar", "darpan");
      Consumer data=  name-> System.out.println(name);
      names.forEach(data);
    }
}
