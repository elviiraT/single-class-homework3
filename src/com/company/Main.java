package com.company;

public class Main {

    public static void main(String[] args)
    {
        Newspaper news = new Newspaper("Helsingin Sanomat", 2020, 11, 16, true);
        Newspaper paper = new Newspaper("The New York Times", 2020, 11,15, false);
        Newspaper[] newspapers = {news, paper};
        for (Newspaper e : newspapers)
        System.out.println(e);
    }
}
