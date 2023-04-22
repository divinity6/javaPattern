package Builder.Procedure.impl;

import Builder.Procedure.types.Builder;

public class XMLBuilder extends Builder {

    public XMLBuilder( Data data ){
        super( data );
    }

    /**
     * - XML 형식의 시작을 나타내는 문자열 반환
     */
    @Override
    public String head() {
        StringBuilder sb = new StringBuilder();

        sb.append( "<?xml version=\"1.0\" encoding=\"utf-8\"?>" );
        sb.append( "<DATA>" );

        return sb.toString();
    }

    /**
     * - XML 형식의 데이터를 문자열로 반환
     */
    @Override
    public String body() {
        StringBuilder sb = new StringBuilder();

        sb.append( "<NAME>" );
        sb.append( this.data.getName() );
        sb.append( "</NAME>" );
        sb.append( "<AGE>" );
        sb.append( this.data.getAge() );
        sb.append( "</AGE>" );

        return sb.toString();
    }

    /**
     * - XML 형식의 끝을 나타내는 문자열 반환
     */
    @Override
    public String foot() {
        return "</DATA>";
    }
}
