package Mediator.impl;

import Mediator.types.Mediator;
import Mediator.types.Participant;

public class HeatBoiler extends Participant {
    private boolean bOff = true;

    public HeatBoiler(Mediator mediator) {
        super(mediator);
    }

    public void on(){
        if ( !( this.bOff ) ){
            return;
        }

        this.bOff = false;

        mediator.participantChanged( this );
    }

    public void off(){
        if ( this.bOff ){
            return;
        }
        this.bOff = true;

        mediator.participantChanged( this );
    }

    public boolean isRunning(){
        return this.bOff;
    }

    @Override
    public String toString(){
        if ( this.bOff ){
            return "# 보일러 : 꺼짐";
        }
        return "# 보일러 : 켜짐";
    }
}
