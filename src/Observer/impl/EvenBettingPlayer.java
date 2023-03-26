package Observer.impl;

import Observer.types.Player;

public class EvenBettingPlayer extends Player {

    public EvenBettingPlayer(String name ){
        super( name );
    }

    @Override
    public void update(int diceNumber) {
        if ( 0 == diceNumber % 2 ){
            System.out.println( this.getName() + "win!" );
        }
    }
}
