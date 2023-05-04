package Visitor.impl;

import Visitor.types.Unit;
import Visitor.types.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class ItemList implements Unit {
    private ArrayList<Unit> list = new ArrayList<Unit>();

    public void add( Unit unit ){
        this.list.add( unit );
    }

    @Override
    public void accept( Visitor visitor) {
        Iterator<Unit> iter = this.list.iterator();

        while ( iter.hasNext() ){
            Unit unit = iter.next();
            visitor.visit( unit );
        }

    }
}
