package Visitor.impl;

import Visitor.types.Unit;
import Visitor.types.Visitor;

public class Item implements Unit {
    private final int value;

    public Item( int value ){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    @Override
    public void accept( Visitor visitor) {
        visitor.visit( this );
    }
}
