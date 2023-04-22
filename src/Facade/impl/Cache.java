package Facade.impl;

import java.util.HashMap;

/**
 * - DBMS 에서 조회된 데이터를 임시로 담아두는 class
 */
public class Cache {
    private HashMap<String , Row> cache = new HashMap<String , Row>();

    /** cache 에 데이터 저장 */
    public void put( Row row ){
        this.cache.put( row.getName() , row );
    }

    /** cache 에서 데이터를 가져옴 */
    public Row get( String name ){
        return this.cache.get( name );
    }
}
