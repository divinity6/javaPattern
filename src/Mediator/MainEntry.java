package Mediator;

import Mediator.impl.SmartHome;

import java.util.Scanner;

public class MainEntry {

    public static void main( String[] args ){
        SmartHome home = new SmartHome();

        try ( Scanner scanner = new Scanner( System.in ) ){
            do {
                home.report();

                System.out.println( "[1] 문 열기" );
                System.out.println( "[2] 문 닫기" );
                System.out.println( "[3] 창문 열기" );
                System.out.println( "[4] 창문 닫기" );
                System.out.println( "[5] 에어컨 켜기" );
                System.out.println( "[6] 에어컨 끄기" );
                System.out.println( "[7] 보일러 켜기" );
                System.out.println( "[8] 보일러 끄기" );

                System.out.print( "명령: " );
                int i = scanner.nextInt();

                if ( 1 == i ){
                    home.door.open();
                }
                else if ( 2 == i ){
                    home.door.close();
                }
                else if ( 3 == i ){
                    home.window.open();
                }
                else if ( 4 == i ){
                    home.window.close();
                }
                else if ( 5 == i ){
                    home.aircon.on();
                }
                else if ( 6 == i ){
                    home.aircon.off();
                }
                else if ( 7 == i ){
                    home.boiler.on();
                }
                else if ( 8 == i ){
                    home.boiler.off();
                }
            }
            while ( true );
        }
    }
}
