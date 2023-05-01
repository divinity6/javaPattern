package AbstractFactory.impl;

import AbstractFactory.types.CheckBox;

public class WindowsCheckBox extends CheckBox {

    public WindowsCheckBox( boolean bChecked ){
        super( bChecked );
    }

    @Override
    public void render() {
        System.out.println(
            "Windows 렌더링 API 를 이용해 " +
            ( this.bChecked ? "체크된" : "체크 안된"  ) +
            " 체크박스를 그립니다."
        );
    }
}
