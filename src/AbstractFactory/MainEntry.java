package AbstractFactory;

import AbstractFactory.impl.LinuxFactory;
import AbstractFactory.types.Button;
import AbstractFactory.types.CheckBox;
import AbstractFactory.types.ComponentFactory;
import AbstractFactory.types.TextEdit;

public class MainEntry {
    public static void main(String[] args) {
        ComponentFactory factory = new LinuxFactory();

        Button button = factory.createButton( "확인" );
        CheckBox checkbox = factory.createCheckBox( false );
        TextEdit textEdit = factory.createTextEdit( "디자인패턴" );

        button.render();
        checkbox.render();
        textEdit.render();

        /** 생성된 컴포넌트들을 사용 */
        button.clickEvent();
        checkbox.setChecked( true );
        textEdit.setValue( "GOF 의 디자인패턴" );
    }
}
