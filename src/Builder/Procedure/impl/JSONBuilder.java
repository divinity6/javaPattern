package Builder.Procedure.impl;

import Builder.Procedure.types.Builder;

public class JSONBuilder extends Builder {

    public JSONBuilder( Data data ){
        super( data );
    }

    @Override
    public String head() {
        return "{";
    }

    /**
     * - 이름과 나이를 json 형식으로 변경하여 반환
     */
    @Override
    public String body() {
        StringBuilder sb = new StringBuilder();

        sb.append( "\"Name\": " );
        sb.append( "\"" + this.data.getName() + "\"" );
        sb.append( ", \"Age\": " );
        sb.append( this.data.getAge() );

        return sb.toString();
    }

    @Override
    public String foot() {
        return "}";
    }
}
