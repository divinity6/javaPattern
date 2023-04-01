package Memento;

import Memento.impl.Walker;

import java.util.Random;

public class MainEntry {

    public static void main( String[] args ){
        Walker walker = new Walker( 0 , 0 , 10 , 10 );
        String[] actions = { "UP" , "RIGHT" , "DOWN" , "LEFT" };
        Random random = new Random();
        double minDistance = Double.MAX_VALUE;
        Walker.Memento memento = null;

        while( true ){
            // actions 의 무작위 번째 선택
            String action = actions[ random.nextInt( 4 ) ];
            double distance = walker.walk( action );
            System.out.println( action + "  " + distance );

            if ( 0.0 == distance ){
                break;
            }

            /** 점점 목표에 가까워 지고 있을 경우 */
            if ( minDistance > distance ){
                minDistance = distance;
                /** 상태를 기억해둠 */
                memento = walker.createMemento();
            }
            else {
                /** 목표와 멀어지고 있을 경우 */
                if ( null != memento ){
                    /** 이전에 기억해둔 상태로 되돌림 */
                    walker.restoreMemento( memento );
                }
            }
        }

        System.out.println( "Walker's path: " + walker );

    }
}
