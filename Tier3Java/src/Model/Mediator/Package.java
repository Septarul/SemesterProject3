package Model.Mediator;

import java.io.Serializable;

public class Package implements Serializable
{
    private String Json;
    private String Task;
    private String Argument;
    private int Argument2;
    private int Argument3;

    public Package() {}


    public Package(String Argument)
    {
        this.Json = null;
        this.Task = null;
        this.Argument = Argument;
        this.Argument2=0;
        this.Argument3=0;
    }


    public Package(String Json, String Task, String Argument, int argument2)
    {
        this.Json = Json;
        this.Task = Task;
        this.Argument = Argument;
        this.Argument2=argument2;
        this.Argument3=0;
    }
    public Package(String Json, String Task, String Argument)
{
    this.Json = Json;
    this.Task = Task;
    this.Argument = Argument;
    this.Argument2=0;
    this.Argument3=0;
}
    public Package(String Task, String Argument)
    {
        this.Json = null;
        this.Task = Task;
        this.Argument = Argument;
        this.Argument2=0;
        this.Argument3=0;
    }
    public Package(String Task, String Argument, int argument2)
    {
        this.Json = null;
        this.Task = Task;
        this.Argument = Argument;
        this.Argument2=argument2;
        this.Argument3=0;
    }
    public Package(String Json, String Task, String Argument, int argument2, int argument3)
    {
        this.Json = Json;
        this.Task = Task;
        this.Argument = Argument;
        this.Argument2=argument2;
        this.Argument3=argument3;
    }
    public Package(String Task, String Argument, int argument2, int argument3)
    {
        this.Json = null;
        this.Task = Task;
        this.Argument = Argument;
        this.Argument2=argument2;
        this.Argument3=argument3;
    }

    public String getJson()
    {
        return Json;
    }
    public void setJson(String json)
    {
        Json = json;
    }
    public String getTask()
    {
        return Task;
    }
    public void setTask(String task)
    {
        Task = task;
    }
    public String getArgument()
    {
        return Argument;
    }
    public void setArgument(String argument) { this.Argument = argument; }
    public int getArgument2()
    {
        return Argument2;
    }
    public void setArgument2(int argument2)
    {
        this.Argument2 = argument2;
    }
    public int getArgument3()
    {
        return Argument3;
    }
    public void setArgument3(int argument3)
    {
        this.Argument3 = argument3;
    }

    public String toString()
    {
        String s = String.format("%s,%s,%s",Json,Task,Argument);
        return s;
    }
}