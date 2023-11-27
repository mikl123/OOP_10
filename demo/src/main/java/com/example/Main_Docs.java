package com.example;

public class Main_Docs{
    public static void main(String[] args) {
        SmartDocument document = new SmartDocument("./image.jpg");
        CacheDocument cacheDocument = new CacheDocument("./image.jpg");
        TimedDocument timedDocument = new TimedDocument("./image.jpg");
        System.out.println(document.parse());
        System.out.println(cacheDocument.parse());
        System.out.println(timedDocument.parse());
    }
}