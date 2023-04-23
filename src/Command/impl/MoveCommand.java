package Command.impl;

import Command.types.Command;

/**
 *  - 출력 위치 지정
 */
public class MoveCommand implements Command {
    private final int x;
    private final int y;

    public MoveCommand( int x , int y ){
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        System.out.print( String.format( "%c[%d;%df" , 0x1B , this.y , this.x ) );
    }
}
