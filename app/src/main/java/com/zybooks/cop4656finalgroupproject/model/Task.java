package com.zybooks.cop4656finalgroupproject.model;

public class Task {

    //

    private int Id;
    private String Name;

    public Task(String name)
    {
        Name = name;
    }

    public int getId() {return Id;}

    public void setId(int id){Id = id;}

    public String getName(){return Name;}

    public void setName(String name){Name = name;}
}
