package ChainOfResponsibility.impl;

import ChainOfResponsibility.types.Handler;

public class DomainHandler extends Handler {

    /**
     * - url 에서 Domain 에 해당하는 문자열을 찾아 출력해주는 코드
     */
    @Override
    protected void process( String url ) {
        int startIndex = url.indexOf( "://" );
        int lastIndex = url.lastIndexOf( ":" );

        System.out.println( "DOMAIN: " );
        if ( -1 == startIndex ){
            if ( -1 == lastIndex ){
                System.out.println( url );
            }
            else {
                System.out.println( url.substring( 0 , lastIndex ) );
            }
        }
        else if ( startIndex != lastIndex ){
            System.out.println( url.substring( startIndex + 3 , lastIndex ) );
        }
        else if ( startIndex == lastIndex ){
            System.out.println( url.substring( startIndex + 3 ) );
        }
        else {
            System.out.println( "NONE" );
        }
    }
}
