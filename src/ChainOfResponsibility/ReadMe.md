### Chain of responsibility( 책임 연쇄 패턴 )

- 책임이란 무언가를 처리하는 기능( 클래스 )


- 여러 개의 책임들을 동적으로 연결해서 순차적으로 실행하는 패턴


- 기능을 클래스 별로 분리하여 구현하도록 유도하므로 클래스의 코드가 최적화됨
  - 기능에 대한 독립성이 보장된다

---

### Diagram

- Handler 
  - 자신과 동일한 클래스 객체를 필드로 가지는 추상 클래스
  - 무언가를 처리하기 위함


- ProtocolHandler
  - protocol 만 처리하는 handler


- DomainHandler
  - domain 만 처리하는 handler


- PortHandler
  - port 만 처리하는 handler


- 위의 기능에서 path 만 처리해야하는 handler 가 추가된다면,
  - pathHandler 를 추가하여 처리할 수 있다

---

### abstract class Handler

- nextHandler : Handler
  - 다음 필드에 대한 handler


- setNext( handler : Handler ) : Handler
  - 다음 책임을 지정하는 메서드


- process( url : String ) : void
  - 구체적인 기능의 구현 코드는 이 process 추상 메서드에 작성한다
  - 자식 코드에서 구현함


- run( url : String ) : void
  - 연결된 책임들을 순차적으로 실행해 준다

---

### 느낀점

- 각 기능들에 대한 타입들이 동일하게 묶이는구나...


- 이렇게 독립적으로 처리하면서, 처음 체인부터 마지막체인까지 순회하면서 해당 값을 처리하네


- 기존 기능은 손대지 않고 새로운 기능을 추가하여 작성할 수 있군!


- 이렇게 처리하게 된다면, 기능단위로 독립적으로 개발될 수 있겠네


- 간단하면서도 강력하게 기능을 추가할 수 있는 것으로 보임


- 즉, 기능들을 책임으로 분리하고, 책임들을 체인처럼 처리하는 패턴이다!