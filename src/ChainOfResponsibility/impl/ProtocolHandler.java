package ChainOfResponsibility.impl;

import ChainOfResponsibility.types.Handler;

public class ProtocolHandler extends Handler {

    /**
     * - protocol 만을 처리하도록 처리
     */
    @Override
    protected void process( String url ) {
        int index = url.indexOf( "://" );

        if ( -1 != index ){
            System.out.println( "PROTOCOL :" + url.substring( 0 , index ) );
        }
        else {
            System.out.println( "NO PROTOCOL" );
        }

    }
}
