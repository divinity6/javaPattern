package Command.impl;

import Command.types.Command;

import java.util.ArrayList;

public class CommandGroup implements Command {
    /** 여러개의 Command 객체를 담을 수 있는 배열 필드 추가 */
    private ArrayList<Command> commands = new ArrayList<Command>();

    /** Command 객체 추가 메서드 */
    public void add( Command command ){
        this.commands.add( command );
    }

    /**
     * - 담긴 command 를 전부실행
     */
    @Override
    public void run() {
        int cntCommands = this.commands.size();
        for ( int i = 0; i < cntCommands; i++ ){
            Command command = commands.get( i );
            command.run();
        }
    }
}
