package com.company;
import java.util.Scanner;
import java.lang.Math.*;

class Value<T> {
    public T num;
    Value(T x) { num = x; }
}

class Any{
    Object val;
    <T>Any(T x) { val = new Value<T>(x); }

    public <T> T get() {
        return (T)((Value<T>) val).num;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Any a = new Any(cin.nextInt());
        System.out.println(a.<Integer>get());

        Any b = new Any(cin.next());
        System.out.println(b.<String>get());

        Any c = new Any(cin.nextDouble());
        System.out.println(c.<Double>get());

    }
}
