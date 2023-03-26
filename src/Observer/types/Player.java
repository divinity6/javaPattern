package Observer.types;

public abstract class Player {
    private final String name;

    public Player( String name ){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void update( int diceNumber );
}
