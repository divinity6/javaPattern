package Facade.impl;

public class Row {
    private String name;
    private String birthday;
    private String email;

    public Row( String name , String birthday , String email ){
        this.name = name;
        this.birthday = birthday;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public String getBirthday(){
        return this.birthday;
    }

    public String getEmail(){
        return this.email;
    }
}
