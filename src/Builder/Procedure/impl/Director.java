package Builder.Procedure.impl;

import Builder.Procedure.types.Builder;

public class Director {
    private Builder builder;

    public Director( Builder builder ){
        this.builder = builder;
    }

    /**
     * - builder 의 메서드를 순서대로 호출해주고 반환해주는 메서드
     */
    public String build(){
        StringBuilder sb = new StringBuilder();

        sb.append( builder.head() );
        sb.append( builder.body() );
        sb.append( builder.foot() );

        return sb.toString();
    }

}
