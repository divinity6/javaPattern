package Interpreter;

import Interpreter.impl.BeginExpression;
import Interpreter.impl.Context;
import Interpreter.types.Expression;

public class MainEntry {

    public static void main( String[] args ){
        /** 해석할 script 문자열 */
        String script = "BEGIN FRONT LOOP 3 LOOP 2 RIGHT FRONT END LOOP 3 LEFT END BACK RIGHT END BACK END";
        System.out.println( script );

        /** 시작 구문 파싱 및 분석 */
        Context context = new Context( script );
        Expression expression = new BeginExpression();

        if ( expression.parse( context ) ){
            System.out.println( expression );

            expression.run();
        }


    }
}
