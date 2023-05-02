package State.impl;

import State.types.State;

public class SitDownState extends State {

    public SitDownState(Player player ){
        super( player );
    }

    @Override
    public void standUp() {
        this.player.setState( new StandUpState( this.player ) );
        this.player.talk( "인나자.." );
    }

    @Override
    public void sitDown() {
        this.player.talk( "쥐나겠다.." );
    }

    @Override
    public void walk() {
        this.player.talk( "앉아서 어떻게 걸어? 일단 서자.." );
        this.player.setState( new StandUpState( this.player ) );
    }

    @Override
    public void run() {
        this.player.talk( "앉아서 어떻게 뛰어? 일단 서자.." );
        this.player.setState( new StandUpState( this.player ) );
    }

    @Override
    public String getDescription() {
        return "앉아 있음";
    }
}
