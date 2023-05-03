package Interpreter.impl;

import java.util.StringTokenizer;

/**
 *  - 스크립트를 구성하는 구문을 하나씩 추출하는 기능 제공
 */
public class Context {
    private StringTokenizer tokenizer; // 공백문자를 구분자로 해서, String 객체를 분리하는 객체
    private String currentKeyword;  // 현재 뽑아낸 구문을 저장

    public Context( String script ){
        this.tokenizer = new StringTokenizer( script );

        this.readNextKeyword();
    }

    /**
     * - 다음 단어를 가지고 있으면,
     *   현재 단어를 다음 단어로 설정하고,
     *   다음단어를 반환
     */
    public String readNextKeyword(){
        /** 다음 단어를 가지고 있는지 확인 */
        if ( this.tokenizer.hasMoreTokens() ){
             this.currentKeyword = this.tokenizer.nextToken();
        }
        else {
            this.currentKeyword = null;
        }

        return this.currentKeyword;
    }

    public String getCurrentKeyword(){
        return this.currentKeyword;
    }

}
