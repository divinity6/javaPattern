package Interpreter.impl;

import Interpreter.types.CommandExpression;

public class LoopCommandExpression extends CommandExpression {

    public static boolean checkValidKeyword( String keyword ){
        return keyword.equals( "LOOP" );
    }

    private int count;
    private CommandListExpression expression;

    public LoopCommandExpression( String keyword ){
        super( keyword );
    }

    @Override
    public boolean parse( Context context ) {
        if ( !( checkValidKeyword( this.keyword ) ) ){
            return false;
        }

        String countKeyword = context.readNextKeyword();

        if ( null == countKeyword ){
            return false;
        }

        try {
            this.count = Integer.parseInt( countKeyword );

            this.expression = new CommandListExpression();

            if ( null == context.readNextKeyword() ){
                return false;
            }

            return this.expression.parse( context );
        }
        catch( NumberFormatException e ){
            return false;
        }
    }

    @Override
    public boolean run() {

        for ( int i = 0; i < this.count; i += 1 ){
            if ( !( this.expression.run() ) ){
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString(){
        return "LOOP(" + this.count + ")" + this.expression;
    }
}
