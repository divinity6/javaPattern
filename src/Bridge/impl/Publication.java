package Bridge.impl;

import Bridge.types.Display;

public class Publication extends Draft {

    private String publisher;
    private int cost;

    public Publication( String title, String author, String[] content , String publisher , int cost ) {
        super(title, author, content);
        this.publisher = publisher;
        this.cost = cost;
    }

    /** 부모 클래스의 print 오버라이드 */
    public void print( Display display ){
        super.print( display );
        printPublicationInfo();
    }

    private void printPublicationInfo(){
        System.out.println( "#" + publisher + "$" + cost );
    }
}
