package com.company;


//Создать класс Сова с полями имя возраст порода и методами охотиться() пожиратьДобычу() спать().
//        Внутри методов просто выводить на экран фразу "Сова охотится", "Сова пожирает добычу" и т.д.
//        Создать в главном классе 4 совы, две из которых будут спать, одна охотиться и еще одна пожирать добычу.
public class Main {

    public static void main(String[] args) {
	Owl owl1 = new Owl();
	owl1.setAge(1);
	owl1.setBreed("Night");
	owl1.setName("Big eyes");
    System.out.println(owl1.getName());
    owl1.sleep();
    Owl owl2 = new Owl();
	owl2.setAge(2);
	owl2.setBreed("Light");
	owl2.setName("Fast");
        System.out.println(owl2.getName());
        owl2.eat();
        Owl owl3 = new Owl();
	owl3.setAge(3);
	owl3.setBreed("Sea");
	owl3.setName("King");
        System.out.println(owl3.getName());
        owl3.hunt();
    Owl owl4 = new Owl();
    owl4.setAge(4);
    owl4.setBreed("normal");
    owl4.setName("King of kings");
        System.out.println(owl4.getName());
        owl4.sleep();

    }
}
