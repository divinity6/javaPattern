package Visitor;

import Visitor.impl.AvgVisitor;
import Visitor.impl.Item;
import Visitor.impl.ItemList;
import Visitor.impl.SumVisitor;

public class MainEntry {
    public static void main(String[] args) {
        /**
         * - 진짜 Composite 패턴이 개사기다..
         *
         * --> 단일 객체처럼 처리하게 해주네 ㅋㅋ
         */

        ItemList list1 = new ItemList();
        list1.add( new Item( 10 ) );
        list1.add( new Item( 20 ) );
        list1.add( new Item( 40 ) );

        ItemList list2 = new ItemList();
        list2.add( new Item( 30 ) );
        list2.add( new Item( 40 ) );

        list1.add( list2 ); // list1 에 list2 를 넣어버림..ㅋㅋ

        ItemList list3 = new ItemList();
        list3.add( new Item( 25 ) );

        list2.add( list3 ); // list2 에 list3 를 넣어버림..ㅋㅋ

        /**
         * - 위의 데이터 구조와 아래 데이터 처리 메서드들이 분리되어 처리 중!!
         */
        SumVisitor sum = new SumVisitor();
        list1.accept( sum );
        System.out.println( "합계: " + sum.getValue() );

        AvgVisitor avg = new AvgVisitor();
        list1.accept( avg );
        System.out.println( "평균: " + avg.getValue() );

    }
}
