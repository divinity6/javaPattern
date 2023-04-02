package Decorator.impl;

import Decorator.types.Item;

import java.util.ArrayList;
import java.util.Iterator;

public class Strings extends Item {
    private final ArrayList<String> strings = new ArrayList<String>();

    public void add( String item ){
        this.strings.add( item );
    }

    @Override
    public int getLinesCount() {
        return this.strings.size();
    }

    @Override
    public int getMaxLength() {
        Iterator<String> iter = this.strings.iterator();
        int maxWidth = 0;

        while( iter.hasNext() ){
            String string = iter.next();
            int width = string.length();

            if ( width > maxWidth ){
                maxWidth = width;
            }
        }

        return maxWidth;
    }

    @Override
    public int getLength( int index ) {
        String string = this.strings.get( index );
        return string.length();
    }

    @Override
    public String getString(int index) {
        return this.strings.get( index );
    }
}
