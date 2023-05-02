package State.impl;

import State.types.State;

public class StandUpState extends State {

    public StandUpState( Player player ){
        super( player );
    }

    @Override
    public void standUp() {
        this.player.talk( "언제 움직일거야" );
    }

    @Override
    public void sitDown() {
        this.player.setState( new SitDownState( this.player ) );
        this.player.talk( "앉으니깐 편하고 좋습니다" );
    }

    @Override
    public void walk() {
        this.player.setSpeed( 5 );
        this.player.setState( new WalkState( this.player ) );
        this.player.talk( "걷기는 제 2 의 생각하기다.." );
    }

    @Override
    public void run() {
        this.player.setSpeed( 10 );
        this.player.setState( new RunState( this.player ) );
        this.player.talk( "갑자기 뛴다" );
    }

    @Override
    public String getDescription() {
        return "제자리에 서 있음";
    }
}
