package State.impl;

import State.types.State;

public class RunState extends State {

    public RunState(Player player ){
        super( player );
    }

    @Override
    public void standUp() {
        this.player.talk( "뛰다가 갑자기 서면 무릎 연골 나가요.." );
        this.player.setSpeed( 0 );
        this.player.setState( new StandUpState( this.player ) );
    }

    @Override
    public void sitDown() {
        this.player.talk( "뛰다가 앉으라고!? ㅁㅊㄴ" );
        this.player.setSpeed( 0 );
        this.player.setState( new StandUpState( this.player ) );
    }

    @Override
    public void walk() {
        this.player.talk( "속도를 줄일께요~" );
        this.player.setSpeed( 8 );
        this.player.setState( new WalkState( this.player ) );
    }

    @Override
    public void run() {
        this.player.talk( "더 빨리 뛰라는 애기지?" );
        this.player.setSpeed( this.player.getSpeed() + 2 );
    }

    @Override
    public String getDescription() {
        return "뛰는 중";
    }
}
