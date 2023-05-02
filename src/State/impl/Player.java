package State.impl;

import State.types.State;

public class Player {
    private int speed;

    public void setSpeed( int speed ){
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    /** 첫 상태는 제자리에 서있는 상태 */
    private State state = new StandUpState( this );

    public void setState( State state ){
        this.state = state;
    }

    public State getState(){
        return this.state;
    }

    public void talk( String msg ){
        System.out.println( "플레이어의 말 : \"" + msg + "\"" );
    }
}
