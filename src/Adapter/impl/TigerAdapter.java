package Adapter.impl;

import Adapter.types.Animal;

public class TigerAdapter extends Animal {

    private final Tiger tiger;

    public TigerAdapter( String name ){
        super( name );

        tiger = new Tiger();
        tiger.setName( name );
    }

    @Override
    public void sound() {
        System.out.print( tiger.getName() + "" );
        tiger.roar();
    }
}
