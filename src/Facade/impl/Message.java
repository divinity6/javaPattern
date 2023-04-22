package Facade.impl;

/**
 * - Row 객체를 가공하는 클래스
 */
public class Message {
    private Row row;    // 가공할 Row 객체

    public Message( Row row ){
        this.row = row;
    }

    public String makeName(){   // row 의 이름 가공
        return "Name: \"" + this.row.getName() + "\"";
    }

    public String makeBirthDay(){   // row 의 생일 가공
        return "Birthday : " + this.row.getBirthday();
    }

    public String makeEmail(){  // row 의 메일 가공
        return "Email" + this.row.getEmail();
    }
}
