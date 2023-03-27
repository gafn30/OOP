package oopp;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Андрей", "owener");
        Person person2 = new Person("Сергей", "no owener");
        Cat cat = new Cat("Персик");
        Call call = new Call(person, cat);
        call.call();

        System.out.print("\n");
        Call call2 = new Call(person2, cat);
        call2.call();
    }
}