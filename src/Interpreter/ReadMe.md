### Interpreter 패턴( 인터프리터 패턴 )

- 문법에 맞춰 작성된 스크립트를 해석
  - 스크립트 구문을 정해진 문법에 맞춰 해석된 것 : context
  - 단어 하나하나의 구문 : expression

- 해석된 구문을 정해진 규칙대로 실행하는 패턴

---

### Diagram

- **Context**
  - 스크립트에서 구문을 뽑아내는 역할


- **interface Expression**
  - 스크립트의 각 구문을 처리하는 인터페이스


- **BeginExpression**
  - Begin 구문을 처리하는 인터페이스



- **abstract class CommandExpression**
    - 실제 실행할 수 있는 명령 구문
    - LOOP , BACK, RIGHT , FRONT , LEFT 등을 처리

  
- **LoopCommandExpression**
  - Loop 와 반복 횟수에 대한 구문 처리
  - CommandExpression 를 상속받음


- **ActionCommandExpression**
  - BACK , RIGHT , LEFT , BACK 등의 구문 처리
  - CommandExpression 를 상속받음



- **CommandListExpression**
  - 여러개의 CommandExpression 객체를 가질 수 있는 class


---

### class Context

- 공백을 기준으로, script 의 문자들을 하나씩 추출해주는 역할을한다

- readNextKeyword() : String
  - 다음 단어를 가지고 있으면, 현재 단어를 다음 단어로 설정 후
  - 다음 단어를 반환


- getCurrentKeyword() : String
  - 현재 단어를 반환


---

### interface Expression

- 2 개의 API 를 제공해준다


- parse( context : Context ) : boolean
  - Context 가 제공하는 구문이 올바른지 확인하고, 
  - 구문에 대한 구체적인 구문 class 객체를 생성해주는 역할을 한다


- run() : boolean
  - 구문에 대한 어떤 기능을 수행한다

---

### class BeginExpression

- BEGIN 구문의 구현을 담당한다
  - BEGIN 부터 , END 구문까지 전부 처리해야하기 때문에,
  - 여러개의 구문을 저장할 수 있는 CommandListExpression 객체를 필드로 갖는다


- static checkValidKeyword( keyword : String ) : boolean
  - 해당 구문이 올바른지 체크하는 메서드
  - 자기 자신을 체크하기 때문에 해당 keyword 가 BEGIN 인지 체크!


- parse( context : Context ) : boolean
  - 현재 구문이 올바른지 체크하고, 다음 구문을 읽어,
  - commandList 에 넣고, commandList.parse 메서드를 호출 후 반환하는 역할

---

### class CommandListExpression

- 여러개의 CommandExpression 을 필드로 갖는다


- 여기에서 각 구문들을 실행해주는 구나...


- parse( context : Context ) : boolean
  - 저장해둔 context 들의 구문을 END 전까지 읽어,
  - CommandExpression 객체를 생성하고 , 
  - 해당 CommandExpression 이 null 이 아니면, 내부 commands 에 추가한다
  - validation 체크를 한다


- run() : boolean
  - commands 에 저장된 모든 run() 메서드 호출

---

### abstract class CommandExpression

- 자신이 처리해야할 keyword 들을 담고 있는 추상 클래스


- 해당 추상 클래스가 필요한 이유는,
  - 문법 구문( BEGIN , END )과 명령 구문( FRONT , LOOP , BACK , RIGHT )을 
  - 구분할 필요성 때문에, 명령 구문을 처리하기 위해 해당 추상클래스로 처리한다


---

### class ActionCommandExpression

- 일반 명령들을 처리

- parse( context : Context ) : boolean
  - 현재 구문이 올바른지 체크여부를 반환한다


- run() : boolean
  - 현재 명령어 문자열 출력

---

### class LoopCommandExpression

- 반복 명령들을 처리


- 명령에 대한 루프를 돌려면 ExpressionList 를 들고 있어야 하는구만...

- parse( context : Context ) : boolean
  - Loop 는 반복할 count 가 존재하니, 
  - 해당 갯수 만큼 반복할 CommandListExpression 객체를 만들어,
  - CommandListExpression.parse 메서드를 호출해 구문이 올바른지 체크 하고 결과를 반환한다


- run() : boolean
  - count 갯수만큼 반복하며, CommandListExpression 의 run 메서드를 실행한다

---

### 느낀점

- 시작하는 BeginExpression 을 따로 빼고, 
  - BeginExpression 이 CommandListExpression 들을 들고있는 형태구나...
  - 보통 나는 동일 interface 처리할때, 해당 프로세스의 시작지점을 어떻게할지 애를 많이먹었었는데,
  - 이런식으로 시작지점을 빼서, 시작지점에서 각각 구문처리를 CommandList 에서하고,
  - 전체 CommandList 처리는 Begin 에서 하는 형태도 좋은 방법이라는걸 배웠네!
  - ( 시작지점의 interface 도 동일하게 구현하는 것도 좋은 팁이네 )


- 아, 이렇게 들고 있는 이유가, 
  - 문법 구문( BEGIN , END )과 명령 구문( FRONT , LOOP , BACK , RIGHT )을 구문을 따로 처리하기 위함이구나...
  - 진짜 코드짜기전에 무조건 분석부터하고 짜야됨...
  - 무지성으로 코드작성하고나면 나중에 무조건 피본다...


- 야 근데 머리좋다, checkValidKeyword 이거를 static 메서드로 빼가지고, 
  - 외부에서 자기자신을 체크하게 만들어주고, 내부에서는 자기자신의 필드를 파라미터로 넘겨서 체크하네
  - 설계 좋네...ㅋㅋ


- CommandListExpression 을 따로 빼둔게 Loop 에서도 빛을 발하네...
  - Loop 내부에서 애를 새로 만들어 내부 명령들을 반복해서 처리하는구만... 
  - 반복하는건 말그대로 그룹으로 처리하는 시선이 필요하네...


- 비슷한 객체의 반복이나오면 그룹, 
  - 즉, Composition 처럼 처리하고, 
  - 해당 반복자를 담을 그룹을 들고 있는게 괜찮은 처리방법 처럼 보임