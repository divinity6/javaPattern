package ChainOfResponsibility.impl;

import ChainOfResponsibility.types.Handler;

public class PortHandler extends Handler {
    /**
     *  - port 처리
     */
    @Override
    protected void process(String url) {
        int index = url.lastIndexOf( ":" );
        if ( -1 != index ){
            String strPort = url.substring( index + 1 );
            try{
                int port = Integer.parseInt( strPort );
                System.out.println( "PORT: " + port );
            }
            catch( NumberFormatException e ){
                e.printStackTrace();
            }
        }

        System.out.println( "NO PORT" );
    }
}
