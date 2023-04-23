package Command.impl;

import Command.types.Command;

public class ColorCommand implements Command {
    /** 색상들을 enum 타입으로 설정 */
    public enum Color {
        /**
         * - 아래의 8개 항목들은 모두
         *
         * --> private Color 클래스를 호출한다
         *
         * --> 파라미터 값( 컬러값 )이 private Color 의 생성자에 전달된다
         *
         * --> 아그니깐, Color black = COLOR.BLACK
         *     이렇게 호출하면 알아서, 아래, color 생성자를 타는것으로 보임
         */
        BLACK( "\u001B[30m" ), RED( "\u001B[31m" ),
        GREEN( "\u001B[32m" ), YELLOW( "\u001B[33m" ),
        BLUE( "\u001B[34m" ), PURPLE( "\u001B[35m" ),
        CYAN( "\u001B[36m" ), WHITE( "\u001B[37m" );

        final private String code;

        private Color( String code ){
            this.code = code;
        }

        public String getCode() {
            return this.code;
        }
    }

    private final Color color;

    public ColorCommand( Color color ){
        this.color = color;
    }

    @Override
    public void run() {
        System.out.print( this.color.getCode() );
    }
}
