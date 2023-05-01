package AbstractFactory.types;

public abstract class Button {
    protected String caption;

    public Button( String caption ){
        this.caption = caption;
    }

    public void clickEvent(){
        System.out.println( this.caption + "버튼을 클릭했습니다" );
    }

    public abstract void render();
}
