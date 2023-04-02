### Decorator 패턴( 데코레이터 패턴 )

- 객체에 기능을 마치 장식처럼 계속 붙일 수 있는 패턴


- 또한, 실행중에도 동적으로 기능을 계속 붙일 수 있어서 소프트웨어의 확장성이 매우 높아진다
  - ( 크리스마스트리에 여러가지 장식을 계속해서 붙여서 확장하는 것 처럼... )

---

### Diagram

- Strings
  - 문자열을 여러개 가진 class
  - 장식할 대상의 내용물


- Decorator 
  - Strings 클래스의 장식을 나타내는 클래스


- SideDecorator , BoxDecorator , LineNumberDecorator
  - 구체적인 장식들을 구현한 클래스들


- Item
  - Strings 와 Decorator 를 하나의 개념으로 다룰 수 있는 추상 클래스
  - Item 을 상속받음으로써, Strings 와 Decorator 를 같은 개념으로 다룰 수 있다

---

### abstract class Item

- abstract getLinesCount() : int
  - 대상 문자열이 몇줄인지를 반환


- abstract getMaxLength() : int
  - 문자열 중 가장 긴 문자열의 길이를 반환


- abstract getLength( index : int ) : int
  - 지정된 index 의 문자열의 길이를 반환


- abstract getString( index : int ) : String
  - 지정된 index 의 문자열을 반환


- print() : void
  - 문자열을 출력해주는 메서드

---

### class Strings

- strings : ArrayList<String>
  - 문자열을 담는 내부 필드


---

### abstract class Decorator

- 장식의 대상이 되는 객체를 주입받아 내부에서 사용할 것을 명시한다


- 즉, item 을 상속받는 모든 class 의 객체를 장식할 수 있다
  - ( Item 추상클래스를 상속받는 모든 class 를 장식할 수 있음 )


- 여기에서도 구현을 미루는구만...

---

### class SideDecorator 

- 왼, 오른쪽에 문자열을 붙여주는 class


- ch : Character;
  - 해당 Item 에 붙여줄 장식( 문자 )

---

### class BoxDecorator

- 왼, 오른쪽에 문자열을 붙여주는 class


- ch : Character;
  - 해당 Item 에 붙여줄 장식( 문자 )


- makeTailString( count : int ) : String
  - 반환하는 문자열 끝에 장식을 추가하기 위한 내부 메서드

---

### class LineNumberDecorator

- 각 line 에 number 를 추가하는 class

---


### 느낀점

- 아! 이게 데코레이터 느낌이구나...


- 프론트엔드에서 기능구조잡을때 데코레이터 패턴 적용하면 무적권 좋아질거같은데...?


- 이거는, 기능이 약간 변경되거나 약간씩 추가될때마다 기존 기능에 데코레이터로 추가하면 너무좋겠네


- 만약, 해당 UI 에 날짜를 뿌려줘야하는데, 해당 날짜가 년도만 나와야한다거나 등등
  - 여러가지 아종이 존재한다면, 이 패턴이 너무적합하겠네!


- js 의 Decorator 라이브러리는 말그대로 Decorator 네 ㅋㅋㅋ
  - 해당 메서드가 실행되기 전 , 후에 변경점을 추가, 제거할 수 있으니깐...
  - 말그대로 해당 기능 및 메서드를 확장하기 용이한 라이브러리네


- 