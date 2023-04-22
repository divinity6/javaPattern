### Builder Procedure 패턴

- 복잡한 구성의 객체를 효과적으로 생성하는 패턴


- 객체 생성 시 여러 단계를 순차적으로 거칠 때, 이 단계의 순서를 결정해 두고,
- 각 단계를 다양하게 구현할 수 있도록 하는 패턴( Procedure )

---

### Diagram

- abstract class Builder
  - 객체를 만드는 메서드들을 제공


- class Director
  - Builder 에서 제공하는 메서드들을 정해진 순서대로 정확히 호출해야함


- class PlainTextBuilder , class JSONBuilder , XMLBuilder
  - Builder class 의 객체를 만드는 추상 메서드를 구체적으로 구현한다


- class Data
  - 제공해주는 Data

---

### abstract class Builder

- 데이터를 가공하는 각 단계들의 메서드를 제공함

- abstract head() : string
- abstract body() : string
- abstract foot() : string


---


### class Director

- Builder 메서드들을 단계에 맞게 호출해주는 역할
  - ( Facade 패턴처럼 단순화를 시켜주고 )
  - ( Template 패턴처럼 순서대로 단계를 호출해준다 )

- build() : String
  - builder 클래스의 head , body , foot 메서드들을
  - 순서에 맞게 호출하여 실행해준다

  

---

### MainEntry

- 데이터를 원하는 형태의 데이터로 가공시켜줌
  - ( 원하는 상황에 맞는 문자열로 변환하는 Strategy 패턴의 역할을 함 )

- Process
  - 데이터를 빌드할 템플릿을 지정하고,
  - 빌드 순서대로 호출할 클래스에 넣어,
  - 데이터를 가공
---

### 느낀점

- 생성시 거쳐야할 단계가 많을 경우 builder 패턴을 적용할 수 있다


- 약간 거쳐야할 template 를 지정해두고, 해당 template 대로 객체를 생성하게 하는 패턴이네


- 빌더들의 단계가 통일되어있어야, 호출하는데서 순서대로 빌드할수 있겠구만!


- **Template 패턴, Facade 패턴, Strategy 패턴을 객체 생성에 적용한 것으로도 볼 수 있다**


- 즉, 여러가지의 패턴이 복합적으로 버무려지고 응용된 패턴이구만...


- 실제 코드짤때는 이런식으로 버무려서 패턴을 적용해 짤때가 많지...ㅋㅋ