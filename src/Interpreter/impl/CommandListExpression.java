package Interpreter.impl;

import Interpreter.types.CommandExpression;
import Interpreter.types.Expression;

import java.util.ArrayList;
import java.util.Iterator;

public class CommandListExpression implements Expression {
    private final ArrayList<CommandExpression> commands = new ArrayList<CommandExpression>();

    @Override
    public boolean parse( Context context ) {

        while ( true ){
            String currentKeyword = context.getCurrentKeyword();

            if ( null == currentKeyword ){
                return false;
            }
            else if ( currentKeyword.equals( "END" ) ){
                context.readNextKeyword();
                break;
            }
            else {
                CommandExpression command = null;

                if ( LoopCommandExpression.checkValidKeyword( currentKeyword ) ){
                    command = new LoopCommandExpression( currentKeyword );
                }
                else if ( ActionCommandExpression.checkValidKeyword( currentKeyword ) ){
                    command = new ActionCommandExpression( currentKeyword );
                }

                if ( null != command && command.parse( context ) ){
                    this.commands.add( command );
                }
                else {
                    return false;
                }

            }
        }
        return true;
    }

    @Override
    public boolean run() {
        Iterator<CommandExpression> iter = this.commands.iterator();

        while( iter.hasNext() ){
            boolean bOK = iter.next().run();

            if ( !( bOK ) ){
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString(){
        return this.commands.toString();
    }
}
