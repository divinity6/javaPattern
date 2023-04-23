package Command.impl;

import Command.types.Command;

/**
 *  - Console 화면을 지우는 역할
 */
public class ClearCommand implements Command {

    @Override
    public void run() {
        /** 콘솔화면 제어 */
        System.out.print( "\033[H\033[2J" );
        System.out.flush();
    }
}
