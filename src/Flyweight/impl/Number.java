package Flyweight.impl;

import java.util.ArrayList;

public class Number {
    private ArrayList<Digit> digitList = new ArrayList<Digit>();

    public Number( int number ){
        /** 전달된 숫자를 문자열로 변환 */
        String strNum = Integer.toString( number );
        int len = strNum.length();

        /**
         * - 해당 문자열에서 문자 하나씩 읽어서,
         *
         * - digitFactory 에서 해당 문자 하나씩 에 대한 값을 가져와 digitList 에 추가
         * */
        DigitFactory digitFactory = new DigitFactory();
        for ( int i = 0; i < len; i++ ){
            int n = Character.getNumericValue( strNum.charAt( i ) );
            Digit digit = digitFactory.getDigit( n );
            this.digitList.add( digit );
        }
    }

    /** 해당 digit 를 화면에 출력 */
    public void print( int x , int y ){
        int cntDigits = digitList.size();
        for ( int i = 0; i < cntDigits; i++ ){
            Digit digit = digitList.get( i );
            digit.print( x +( i*8 ) , y );
        }
    }
}
