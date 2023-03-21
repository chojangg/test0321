package kr.hs.study;

public class Person {
    String name;
    int age;
    job career;

    public Person(String name){
        this.name = "jayun";
    }

    public Person(int age){
        this.age = 19;
    }

    public Person(job career){

    }

    public void printData() {
        System.out.println(name);
        System.out.println(age);
        System.out.println("메서드 호출");
    }
}
