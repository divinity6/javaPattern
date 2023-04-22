package Facade.impl;

public class Facade {
    private DBMS dbms = new DBMS();
    private Cache cache = new Cache();

    /**
     * - 검색할 이름값을 파라미터로 받음
     *
     * --> 해당 이름으로 조회후 결괏값을 반환
     */
    public void run( String name ){
        Row row = cache.get( name );    // cache 에서 먼저 조회

        if ( row == null ){
            row = dbms.query( name );

            if ( row != null ){
                cache.put( row );
            }
        }

        if ( row != null ){ // 조회된 데이터가 있다면 Message 로 가공 후 출력
            Message message = new Message( row );

            System.out.println( message.makeName() );
            System.out.println( message.makeBirthDay() );
            System.out.println( message.makeEmail() );
        }
        else {  // 해당 이름의 데이터가 존재하지 않다고 출력
            System.out.println( name + "is not exists." );
        }
    }
}
