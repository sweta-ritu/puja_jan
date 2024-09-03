package ums;

public class Student {
    private int id;
    private  String name;
    private int fees;

    //constructor
    public Student (int id,String name,int fees){
        this.id=id;
        this.name=name;
        this.fees=fees;
    }

// getters
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getFees() {
        return fees;
    }
}
