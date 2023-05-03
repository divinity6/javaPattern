package Interpreter.impl;

import Interpreter.types.CommandExpression;

public class ActionCommandExpression extends CommandExpression {

    public static boolean checkValidKeyword( String keyword ){
        boolean bKeywordOk =
                keyword.equals( "FRONT" ) ||
                keyword.equals( "BACK" ) ||
                keyword.equals( "LEFT" ) ||
                keyword.equals( "RIGHT" );

        return bKeywordOk;
    }

    public ActionCommandExpression( String keyword ){
        super( keyword );
    }

    @Override
    public boolean parse(Context context) {
        if ( !( checkValidKeyword( this.keyword ) ) ){
            return false;
        }

        if ( null == context.readNextKeyword() ){
            return false;
        }

        return true;
    }

    @Override
    public boolean run() {
        System.out.println( "cmd: " + this.keyword );
        return true;
    }

    @Override
    public String toString(){
        return this.keyword;
    }
}
