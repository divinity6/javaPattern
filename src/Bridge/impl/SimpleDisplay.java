package Bridge.impl;

import Bridge.types.Display;

public class SimpleDisplay implements Display {


    @Override
    public void title(Draft draft) {
        System.out.println( draft.getTitle() );
    }

    @Override
    public void author(Draft draft) {
        System.out.println( draft.getAuthor() );
    }

    @Override
    public void content(Draft draft) {
        var content = draft.getContent();

        for ( var i = 0; i < content.length; i += 1 ){
            System.out.println( content[ i ] );
        }
    }
}
