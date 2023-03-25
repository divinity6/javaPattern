package Flyweight.impl;

public class DigitFactory {

    /**
     * - 이렇게 null 로 기본값을 설정할 수도 있네 ㅋㅋ
     * - ts 도 이거되려나 ㅋㅋㅋ
     */
    private Digit[] pool = new Digit[] {
            null , null , null , null , null , null , null , null , null , null
    };

    public Digit getDigit( int n ){
        if ( null != pool[ n ] ){
            return pool[ n ];
        }
        else {
            String fileName = String.format( "./src/FlyWeight/files/%d.txt" , n );
            Digit digit = new Digit( fileName );
            pool[ n ] = digit;
            return digit;
        }
    }
}
