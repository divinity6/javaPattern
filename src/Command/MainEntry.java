package Command;

import Command.impl.*;
import Command.types.Command;

public class MainEntry {

    public static void main( String[] args ){
        CommandGroup cmdGroup = new CommandGroup();

        /** clear 커맨드 */
        Command clearCmd = new ClearCommand();
        cmdGroup.add( clearCmd );

        /** color 커맨드 */
        Command yellowColorCmd = new ColorCommand( ColorCommand.Color.YELLOW );
        cmdGroup.add( yellowColorCmd );

        /** move 커맨드 */
        Command moveCmd = new MoveCommand( 10 , 1 );
        cmdGroup.add( moveCmd );

        /** 문자열 출력 */
        Command printCmd = new PrintCommand( "안녕하세요! 디자인패턴!" );
        cmdGroup.add( printCmd );

        /** move 커맨드 */
        Command moveCmd2 = new MoveCommand( 15 , 5 );
        cmdGroup.add( moveCmd2 );

        cmdGroup.add( printCmd );

        /** move 커맨드 */
        Command moveCmd3 = new MoveCommand( 25 , 8 );
        cmdGroup.add( moveCmd3 );

        /** color 커맨드 */
        Command greenColorCmd = new ColorCommand( ColorCommand.Color.GREEN );
        cmdGroup.add( greenColorCmd );

        cmdGroup.add( printCmd );

        cmdGroup.run();
    }
}
