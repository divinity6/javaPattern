package Proxy.impl;

import Proxy.types.Display;

import java.util.ArrayList;

public class BufferDisplay implements Display {
    private ArrayList<String> buffer = new ArrayList<String>();
    private ScreenDisplay screen;
    private int bufferSize;

    public BufferDisplay( int bufferSize ){
        this.bufferSize = bufferSize;
    }

    @Override
    public void print(String content) {
        this.buffer.add( content );

        if ( this.buffer.size() == this.bufferSize ){
            this.flush();
        }

    }

    public void flush(){

        if ( null == this.screen ){
            this.screen = new ScreenDisplay();
        }

        String lines = String.join( "\n" , this.buffer );
        this.screen.print( lines );
        this.buffer.clear();
    }
}
