package Decorator.impl;

import Decorator.types.Decorator;
import Decorator.types.Item;

public class SideDecorator extends Decorator {
    private final Character ch;

    public SideDecorator( Item item , Character ch ) {
        super( item );
        this.ch = ch;
    }

    @Override
    public int getLinesCount() {
        return this.item.getLinesCount();
    }

    @Override
    public int getMaxLength() {
        return this.item.getMaxLength() + 2;
    }

    @Override
    public int getLength(int index) {
        return this.item.getLength( index ) + 2;
    }

    @Override
    public String getString(int index) {
        return this.ch + this.item.getString( index ) + this.ch;
    }
}
