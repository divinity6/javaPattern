package Bridge.impl;

import Bridge.types.Display;

public class Draft {

    private String title;
    private String author;
    private String[] content;

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String[] getContent() { return content; }

    public Draft( String title , String author , String[] content ){
        this.title = title;
        this.author = author;
        this.content = content;
    }

    /** 출력의 구체적인 구현은 Display 인터페이스를 사용한다 */
    public void print( Display display ){
        display.title( this );
        display.author( this );
        display.content( this );
    }
}
