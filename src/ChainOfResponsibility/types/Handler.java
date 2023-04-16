package ChainOfResponsibility.types;

public abstract class Handler {
    protected Handler nextHandler = null;

    public Handler setNext( Handler handler ){
        this.nextHandler = handler;
        return handler;
    }

    protected abstract void process( String url );

    public void run( String url ){
        this.process( url );

        if ( null != nextHandler ){
            nextHandler.run( url );
        }
    }
}
