package Proxy.impl;

import Proxy.types.Display;

public class ScreenDisplay implements Display {
    @Override
    public void print( String content ) {
        try {
            // 출력을 위한 준비작업
            Thread.sleep( 500 );
        }
        catch( InterruptedException e ){
            e.printStackTrace();
        }

        System.out.println( content );
    }
}
