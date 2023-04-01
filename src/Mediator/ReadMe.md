### Mediator 패턴( 중재자 패턴 )

- 여러가지 상황에 따라, 각 개체들은 관계를 밀접하게 맺음으로써, 다른 객체를 조작할 수 있어야 한다


- ( 객체가 많아질수록 복잡도가 증가한다 )


- 각, 객체간의 복잡한 관계를 단순화 시키기 위하여 중간에 중재자( Mediator )를 두고,


- 객체들은 다른 객체들과 관계를 맺지 않고 오직, 중재자와 관계를 맺는다


- 즉, 복잡한 관계를 단순화 시키는 패턴

---

### Diagram

- 만약, 기온이 올라가서 에어컨을 켜야할 경우, 창 , 문 객체에 닫으라는 요청, 보일러를 끄라는 요청을 해야한다


- 또, 창, 문을 열게 되면, 에어컨이 켜져있는지 확인해서, 에어컨을 끄라고 요청해야한다


- 반대로 기온이 내려가서 보일러를 켜야할 경우, 창 , 문 객체에 닫으라는 요청, 에어컨을 끄라는 요청을 해야한다


- 또한, 날씨가 덥지도,춥지도않다면, 에어컨과 보일러 객체에 끄라는 요청을 보내고, 창과 문을 열라는 요청을 보낸다


- 이럴때 중재자 패턴을 이용한다

---

### interface Mediator

- 각 객체들은 자신의 상태가 변경되면, participantChanged 메서드를 호출해야 한다

---

### class Window, class Door

- bClosed : boolean
  - 닫혔는지 여부를 체크하는 필드


- open(), close() : void
  - 열고 닫는 메서드
  - bClosed 상태값을 변경하고, participantChanged 호출


- isClosed() : boolean
  - bClosed 상태 반환

---

### class HeadBoiler, class CoolAircon

- bOff : boolean
  - 꺼졌는지 여부를 체크하는 필드


- on(), off() : void
  - 끄고 켜는 메서드
  - bOff 상태값을 변경하고, participantChanged 호출


- isRunning() : boolean
  - bOff 상태 반환

---

### class SmartHome

- Mediator 를 구현한 해당 클래스는 다른 class 들을 참여자로 가진다


- participantChanged( participant : Participant ) : void
  - 참여자 객체들간의 관계가 participantChanged 메서드에 집중되어 있다
  - 자주 변경되는 것들이 한곳에 집중되어 있는 것이 유지보수하기 좋고, 시스템이 단순하고 간결해진다


- report() : void
  - 참여자들의 정보를 출력

---

### 느낀점

- 아, 그니깐 많은 객체들 간의 상호작용이 빈번하게 일어날 경우 사용하는 패턴이구만...


- Mediator 에서 상태를 한꺼번에 관리하기 때문에 코드의 가독성이 올라가고, 


- 상태처리를 한눈에 볼 수 있고, 복잡시럽지 않아서 매우좋음!
  - 무적권 observer 로 하는것보다 Mediator 패턴이 훨 좋아보임


- 에디터에서 이벤트가 발생할 경우, 이패턴을 사용하면 좋겠네


- 이벤트가 발생할 경우, 해당 이벤트에 대한 동작 처리를 많은 객체들에 요청하고 처리해야하니깐...
  - 예) keyup : 
    - GridManager : 문단 추가 , 제거 처리, 
    - Caret : 마우스 위치 처리
    - Toolbar : Toolbar 위치 처리
    - UndoManager : 실행 취소 이벤트 등록 처리