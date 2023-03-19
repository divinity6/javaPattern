package Adapter;

import Adapter.impl.Cat;
import Adapter.impl.Dog;
import Adapter.impl.TigerAdapter;
import Adapter.types.Animal;

import java.util.ArrayList;

public class MainEntry {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add( new Dog( "댕이" ) );
        animals.add( new Cat( "솜털이" ) );
        animals.add( new Cat( "츄츄" ) );
        animals.add( new TigerAdapter( "타이온" ) );

        animals.forEach( animal -> {
            animal.sound();
        } );
    }
}
