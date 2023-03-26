package Observer.impl;

import Observer.types.Player;

public class OddBettingPlayer extends Player {

    public OddBettingPlayer( String name ){
        super( name );
    }

    @Override
    public void update(int diceNumber) {
        if ( 1 == diceNumber % 2 ){
            System.out.println( this.getName() + "win!" );
        }
    }
}
