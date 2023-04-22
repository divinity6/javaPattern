package Facade.impl;

import java.util.HashMap;

public class DBMS {
    // 데이터를 저장하기 위한 db 필드
    private HashMap<String , Row> db = new HashMap<String , Row>();

    /**
     * DB 필드에 Row 데이터를 추가
     */
    public DBMS(){
        db.put( "jane" , new Row( "Jane" , "1990-02-14" , "jane09@geosee.co.kr" ) );
        db.put( "robert" , new Row( "Robert" , "1979-11-05" , "nice@googl.com" ) );
        db.put( "dorosh" , new Row( "Dorosh" , "1985-08-21" , "doshdo@nave.net" ) );
    }

    /**
     * - DBMS 를 통한 조회이므로, 실제로는 연산시 시간이 소요되므로,
     * - 이를 흉내내기 위해 sleep 으로 1초간 threed 를 멈추도록 한다
     * - 그 후 , 조회한 이름의 데이터를 반환한다
     */
    public Row query( String name ){
        try {
            Thread.sleep( 1000 );
        }
        catch ( InterruptedException e  ) {
            e.printStackTrace();
        }

        return db.get( name.toLowerCase() );
    }
}
