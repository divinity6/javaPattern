package Command.impl;

import Command.types.Command;

/**
 * - 원하는 문자열을 화면에 출력
 */
public class PrintCommand implements Command {
    private String content;

    public PrintCommand( String content ){
        this.content = content;
    }

    @Override
    public void run() {
        System.out.print( this.content );
    }
}
