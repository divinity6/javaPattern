package Decorator.types;

public abstract class Item {
    public abstract int getLinesCount();
    public abstract int getMaxLength();
    public abstract int getLength( int index );
    public abstract String getString( int index );

    public void print() {
        int cntLines = this.getLinesCount();
        for ( int i = 0; i < cntLines; i++ ){
            String string = this.getString( i );
            System.out.println( string );
        }
    }
}
