package com.company;

public class OOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(4);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);

        Student avni = new Student();
        avni.calculate_tPercentage(99,99,99);
        avni.change_name("Avni");

    }
}
class Pen{
    //This is the blueprint of the class Pen

    //These are the properties we have
    int tip;
    String color;

    //These are the functions we want to perform on our properties
    void setTip(int newTip){
        tip = newTip;
    }

    void setColor(String newColor){
        color = newColor;
    }
}

class Student{

    String name;
    int age;
    int percentage;

    void calculate_tPercentage(int phy, int chem, int math){
        percentage = (math+phy+chem)/3;
        System.out.println(percentage+"%");

    }

    void change_name(String newname){
        name = newname;
        System.out.println(newname);
    }
}