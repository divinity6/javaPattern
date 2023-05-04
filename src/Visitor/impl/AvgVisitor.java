package Visitor.impl;

import Visitor.types.Unit;
import Visitor.types.Visitor;

public class AvgVisitor implements Visitor {
    private int sum = 0;
    private int count = 0;

    public double getValue(){
        return this.sum / this.count;
    }


    @Override
    public void visit(Unit unit) {
        if ( unit instanceof Item ){
            this.sum += ( ( Item )unit ).getValue();
            this.count += 1;
        }
        else {
            unit.accept( this );
        }
    }
}
