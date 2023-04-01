package Mediator.impl;

import Mediator.types.Mediator;
import Mediator.types.Participant;

public class CoolAircon extends Participant {
    private boolean bOff = true;

    public CoolAircon(Mediator mediator) {
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
            return "# 에어컨 : 꺼짐";
        }
        return "# 에어컨 : 켜짐";
    }
}
