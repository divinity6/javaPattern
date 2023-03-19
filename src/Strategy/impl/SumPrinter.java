package Strategy.impl;

import Strategy.types.SumStrategy;

public class SumPrinter {
    public void print( SumStrategy strategy , int N ){
        System.out.printf( "The Sum of 1 - %d :" , N );
        System.out.println( strategy.get( N ) );
    }
}
