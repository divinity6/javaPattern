package Visitor.impl;

import Visitor.types.Unit;
import Visitor.types.Visitor;

/**
 * - 데이터가 가진 정수값들을 합산하는 기능을 처리하는 객체
 */
public class SumVisitor implements Visitor {
    private int sum = 0;

    public int getValue(){
        return this.sum;
    }

    /**
     * - 정수값을 가진 단일 데이터일 경우, sum 필드에 추가
     *
     * - 집합 객체일 경우 accept 메서드 호출
     */
    @Override
    public void visit( Unit unit ) {
        if ( unit instanceof Item ){
            this.sum += ( ( Item )unit ).getValue();
        }
        else {
            unit.accept( this );
        }
    }
}
