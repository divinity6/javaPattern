package Flyweight.impl;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Digit {

    private ArrayList<String> data = new ArrayList<String>();

    /**
     * - 파일을 열어서 8줄을 읽고, 닫음
     *
     * --> 파일을 열거나 읽고 닫는 연산을 최소한으로 줄이는 것은
     *     중요한 최적화중 하나이다
     */
    public Digit( String fileName ){
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader( fileName );
            br = new BufferedReader( fr );

            for ( int i = 0; i < 8; i++ ){
                this.data.add( br.readLine() );
            }
        }
        catch( IOException e ){
            e.printStackTrace();
        }
        finally {
            try{
                if ( fr != null ){
                    fr.close();
                }

                if ( br != null ){
                    br.close();
                }
            }
            catch ( IOException e ){
                e.printStackTrace();
            }
        }
    }

    /** 화면에 출력 */
    public void print( int x , int y ){
        for ( int i = 0; i < 8; i++ ){
            String line = data.get( i );
            System.out.print( String.format( "%c[%d;%df", 0x1B, y + i , x ) );
            System.out.print( line );
        }
    }
}
