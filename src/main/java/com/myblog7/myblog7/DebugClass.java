package com.myblog7.myblog7;

public class DebugClass {
    public static void main(String[] args) {
//        DebugClass debugClass=new DebugClass();
//        int val = debugClass.test();
//        System.out.println(val);
//    }
//    private int test() {
//        int x=100;
//        return x;

        DebugClass debugClass= new DebugClass();
        int val = debugClass.test();
        System.out.println(val);
    }
    private int test() {
        int result = SimpleTest.test1();
        System.out.println(result);
        return result;
    }
}
