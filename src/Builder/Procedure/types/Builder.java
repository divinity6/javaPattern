package Builder.Procedure.types;

import Builder.Procedure.impl.Data;

public abstract class Builder {
    protected Data data;        // 처리해야할 Data 객체를 필드로 갖는다

    public Builder( Data data ){
        this.data = data;
    }

    /**
     * - 아래 3개의 추상메서드를 통해서 원하는 형태의
     *   문자열을 생성하게 된다
     */
    public abstract String head();
    public abstract String body();
    public abstract String foot();

}
