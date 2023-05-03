package Interpreter.impl;

import Interpreter.types.Expression;

public class BeginExpression implements Expression {

    public static boolean checkValidKeyword( String keyword ){
        return keyword.equals( "BEGIN" );
    }

    private CommandListExpression expression;

    @Override
    public boolean parse( Context context ) {

        if ( checkValidKeyword( context.getCurrentKeyword() ) ){

            context.readNextKeyword();

            this.expression = new CommandListExpression();

            return this.expression.parse( context );
        }

        return false;
    }

    @Override
    public boolean run() {
        return this.expression.run();
    }

    @Override
    public String toString(){
        return "BEGIN" + this.expression;
    }
}
