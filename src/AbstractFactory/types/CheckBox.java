package AbstractFactory.types;

public abstract class CheckBox {
    protected boolean bChecked;

    public CheckBox( boolean bChecked ){
        this.bChecked = bChecked;
    }

    public void setChecked( boolean bChecked ){
        this.bChecked = bChecked;
        render();
    }

    public abstract void render();
}
