package Visitor.types;

/**
 * - 데이터 구조를 나타내는 인터페이스
 */
public interface Unit {
    /**
     * - 데이터 처리 visitor 객체를 허용하는
     *   accept API 만 존재
     */
    void accept( Visitor visitor );
}
