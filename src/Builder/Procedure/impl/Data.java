package Builder.Procedure.impl;

public class Data {
    private final String name;    // 이름
    private final int age;        // 나이

    public Data( String name , int age ){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
