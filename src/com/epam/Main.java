package com.epam;

import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        String name = "Olga Shcherbyna";
        System.out.println(name);
        Assert.assertSame("Olga Shcherbyna", name);
    }
}
