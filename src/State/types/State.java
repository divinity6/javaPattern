package State.types;

import State.impl.Player;

public abstract class State {
    protected Player player;

    public State( Player player ){
        this.player = player;
    }

    /** 제자리에 서 있는 상태 */
    public abstract void standUp();
    /** 제자리에 앉아있는 상태 */
    public abstract void sitDown();
    /** 걷는 상태 */
    public abstract void walk();
    /** 달리는 상태 */
    public abstract void run();
    /** 현재 상태를 문자열로 반환 */
    public abstract String getDescription();
}
