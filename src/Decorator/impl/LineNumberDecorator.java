package Decorator.impl;

import Decorator.types.Decorator;
import Decorator.types.Item;

public class LineNumberDecorator extends Decorator {

    public LineNumberDecorator(Item item ) {
        super( item );
    }

    @Override
    public int getLinesCount() {
        return this.item.getLinesCount();
    }

    @Override
    public int getMaxLength() {
        return this.item.getMaxLength() + 4;
    }

    @Override
    public int getLength(int index) {
        return this.item.getLength( index ) + 4;
    }

    @Override
    public String getString(int index) {
        return String.format( "%02d" , index ) + ": " + this.item.getString( index );
    }
}
