package com.example;

public class TimedDocument extends SmartDocument{

    public TimedDocument(String gcsPath) {
        super(gcsPath);
    }
    public String parse()  {
        long startTime = System.nanoTime();
        String res= super.parse();

        long endTime = System.nanoTime();

        long executionTime = (endTime - startTime) / 1000000;

        System.out.println(executionTime);
        return res;
    } 
}
