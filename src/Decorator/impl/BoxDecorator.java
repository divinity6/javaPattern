package Decorator.impl;

import Decorator.types.Decorator;
import Decorator.types.Item;

public class BoxDecorator extends Decorator {

    public BoxDecorator( Item item ) {
        super( item );
    }

    @Override
    public int getLinesCount() {
        return this.item.getLinesCount() + 2;
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
        int maxWidth = this.getMaxLength();

        if ( 0 == index || index == this.getLinesCount() - 1 ){
            StringBuilder sb = new StringBuilder();
            sb.append( '+' );
            for ( int i = 0; i < maxWidth - 2; i++ ){
                sb.append( '-' );
            }
            sb.append( '+' );
            return sb.toString();
        }
        return '|' + this.item.getString( index - 1 ) + this.makeTailString( maxWidth - this.getLength( index - 1 ) );
    }

    private String makeTailString( int count ){
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < count; i++ ){
            sb.append( ' ' );
        }
        sb.append( '|' );

        return sb.toString();
    }
}
