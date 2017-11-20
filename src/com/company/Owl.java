package com.company;

public class Owl {
    private int age;
    private String name;
    private String breed;


    public Owl (){

    }

    public void hunt (){

        System.out.println("Охотиться");
    }
    public  void sleep(){
        System.out.println("Спит");
    }

    public  void  eat (){
        System.out.println("жует Добычу");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }


}


