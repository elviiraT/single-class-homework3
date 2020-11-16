package com.company;

public class Newspaper
{
    public Newspaper (String name, int year, int month, int dayOfMonth, boolean isFinnish)
    {
        this.name = name;
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.isFinnish = isFinnish;
    }

    public String toString ()
    {
        return name + " ("+ dayOfMonth + "." + month + "." +year +")" + ": " + isFinnish;
    }

    public String getName()
    {
        return name;
    }

    public void setDate (int year, int month, int dayOfMonth)
    {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    public int getYear()
    {
        return year;
    }

    public int getMonth()
    {
        return month;
    }

    public int getDayOfMonth ()
    {
        return month;
    }

    public boolean getisFinnish ()
    {
        return isFinnish;
    }

    private String name;
    private int year;
    private int month;
    private int dayOfMonth;
    private boolean isFinnish;
}
