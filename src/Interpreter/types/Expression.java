package Interpreter.types;

import Interpreter.impl.Context;

/**
 * 2 개의 API 를 제공해준다
 */
public interface Expression {
    boolean parse( Context context );
    boolean run();
}
