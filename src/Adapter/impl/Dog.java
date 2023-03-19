package Adapter.impl;

import Adapter.types.Animal;

public class Dog extends Animal {

    public Dog( String name ){
        super( name );
    }

    @Override
    public void sound() {
        System.out.println( name + "Barking" );
    }
}
