package State.impl;

import State.types.State;

public class WalkState extends State {

    public WalkState( Player player ){
        super( player );
    }

    @Override
    public void standUp() {
        this.player.setSpeed( 0 );
        this.player.talk( "멈춰..." );
        this.player.setState( new StandUpState( this.player ) );
    }

    @Override
    public void sitDown() {
        this.player.setSpeed( 0 );
        this.player.talk( "걷다가 앉으면 넘어질 수 있어요.." );
        this.player.setState( new SitDownState( this.player ) );
    }

    @Override
    public void walk() {
        this.player.talk( "난 걷는걸 좋아하지.." );
    }

    @Override
    public void run() {
        this.player.setSpeed( 20 );
        this.player.talk( "걷다가 뛰면 열라 빨리 뛸 수 있지!" );
        this.player.setState( new RunState( this.player ) );
    }

    @Override
    public String getDescription() {
        return "걷는 중";
    }
}
