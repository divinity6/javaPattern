package Mediator.impl;

import Mediator.types.Mediator;
import Mediator.types.Participant;

public class Window extends Participant {
    private boolean bClosed = true;

    public Window(Mediator mediator) {
        super(mediator);
    }

    public void open(){
        if ( !( this.bClosed ) ){
            return;
        }
        this.bClosed = false;
        mediator.participantChanged( this );
    }

    public void close(){
        if ( this.bClosed ){
            return;
        }

        this.bClosed = true;
        mediator.participantChanged( this );
    }

    public boolean isClosed(){
        return this.bClosed;
    }

    @Override
    public String toString(){
        if ( this.bClosed ){
            return "# 창 : 닫힘";
        }
        return "# 창 : 열림";
    }
}
