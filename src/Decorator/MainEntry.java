package Decorator;

import Decorator.impl.BoxDecorator;
import Decorator.impl.LineNumberDecorator;
import Decorator.impl.SideDecorator;
import Decorator.impl.Strings;
import Decorator.types.Item;

public class MainEntry {

    public static void main( String[] args ){
        Strings strings = new Strings();

        strings.add( "Hello~" );
        strings.add( "My Name is Jeon Se-Hoon." );
        strings.add( "I am a Frontend Developer." );
        strings.add( "Design Pattern is powerful tool." );

        strings.print();

        System.out.println( "===== Side Decorator =====" );
        Item sideDecorator = new SideDecorator( strings , '\"' );
        sideDecorator.print();

        System.out.println( "===== LineNumber Decorator =====" );
        Item lineNumberDecorator = new LineNumberDecorator( strings );
        lineNumberDecorator.print();

        System.out.println( "===== Box Decorator =====" );
        Item boxDecorator = new BoxDecorator( strings );
        boxDecorator.print();


    }
}
