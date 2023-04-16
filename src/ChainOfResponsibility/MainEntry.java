package ChainOfResponsibility;

import ChainOfResponsibility.impl.DomainHandler;
import ChainOfResponsibility.impl.PortHandler;
import ChainOfResponsibility.impl.ProtocolHandler;
import ChainOfResponsibility.types.Handler;

public class MainEntry {

    public static void main( String[] args ){
        Handler handler1 = new ProtocolHandler();
        Handler handler2 = new PortHandler();
        Handler handler3 = new DomainHandler();

        /** 체인으로 작성 */
        handler1.setNext( handler2 ).setNext( handler3 );

        String url = "http://www.youtube.com:1007";
        System.out.println( "INPUT: " + url );

        handler1.run( url );
    }
}
