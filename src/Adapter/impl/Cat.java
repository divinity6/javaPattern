package Adapter.impl;

import Adapter.types.Animal;

public class Cat extends Animal {

    public Cat( String name ){
        super( name );
    }
    @Override
    public void sound() {
        System.out.println( name + "Meow" );
    }
}
