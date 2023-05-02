### State 패턴( 상태 패턴 )

- 상태를 객체화한 패턴
  - 상태처리를 위한 if 조건문을 많이 작성하게 되는데,이런 조건문을 줄여준다
  - 조건문들은 코드를 복잡하게 만들기 때문에, 이런 조건문을 상태 객체로 처리하게 된다

- 조건절( if )을 효과적으로 줄여주는 패턴

---

### Diagram

- **Player**
  - 4 가지 상태를 가질 수 있다
  - abstract class State 를 필드로 가짐


- abstract class **State**
  - 공통된 상태 타입정의
  - Player 객체를 필드로 가짐


- **StandUpState**
  - 제자리에 서있는 상태
  - abstract class State 를 상속받음


- **SitDownState**
  - 제자리에 앉아있는 상태
  - abstract class State 를 상속받음

- **WalkState**
  - 걷는 상태
  - abstract class State 를 상속받음


- **RunState**
  - 달리는 상태
  - abstract class State 를 상속받음

---

### 느낀점

- 아 프론트에서 store 로 상태관리를 하는 것도 state 패턴을 적용한 거구만...


- State 객체에서도 Player 객체를 알고있어야하네...
  - 그래야지 Player 의 상태값을 변경 처리할 수 있으니까..

  
- 플레이어 상태 4가지 + 변경될 상태 4가지
  - 총 16 가지의 경우의 수가 있는데 
  - State 객체에서는 변경될 상태 처리를 담당하므로, Player 객체를 알고 있어야하네


- 그동안 강박적으로 this 를 파라미터로 안넘기려고 했던게 잘못이네...
  - 상황에 따라,( 해당 객체를 변경해야 한다면 ) 넘기는게 낫네
  - 강박적으로 안넘기고 막 억지 코드를 작성하는 것본단!
  - 단지, 함수형으로 작성할때는 복사본을 보통쓰니깐...


- 이거 실제로 Store 에 적용해본다면, 
  - Store.state 가 여기의 Player 가 되고,
  - Store.mutation 이 setState 가 되겠네
  - 그리고 State 객체는, Store.action 객체가 되는거네!


- 이렇게보니 쉽게 이해하고 사용할만하구먼...