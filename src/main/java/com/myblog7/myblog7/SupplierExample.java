package com.myblog7.myblog7;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
      Supplier<Integer>val=()-> new Random().nextInt(250);
        Integer x = val.get();
        System.out.println(x);

    }

}
