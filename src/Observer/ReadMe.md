### Observer 패턴( 옵져버 패턴 )

- 어떤 상태가 변경되었을 경우, 상태 변경에 관심이 있는 관찰자들에게 알려주는 패턴
  - ( 변태적인 패턴이구나... )


- 상태가 변경되면, 대상은 관찰자에게 자신의 상태가 변경되었음을 알린다

---

### Diagram

- DiceGame 객체는 주사위 게임을 나타내는 class


- 주사위 게임에 참가하는 Player class 객체를 여러개 추가가능


- 주사위를 던지면 주사위의 값을 Player 객체에게 알린다


- 던진 주사위의 수가 상태변화!


- FairDiceGame 은 DiceGame 를 상속받는데, 1~6 까지의 수가 공평하게 나오도록 구현


- Player 또한, 던진 주사위의 수에 따라서, 다양하게 구현하기 위해 추상클래스로 처리함

---

### abstract class Player

- name : String
  - player 의 이름


- update() : void
  - 던진 주사위 눈에 따라서 처리하는 추상 메서드

---

### abstract class DiceGame

- playerList : LinkedList<Player>
  - 주사위 게임에 참가한 Player 리스트


- play() : void
  - 주사위의 수를 변경할 수 있는 메서드

---

### class FairDiceGame

- random : Random
  - 주사위의 수를 무작위로 결정하기 위해 random 필드 추가


- play : void
  - 1 ~ 6 까지 무작위 난수를 얻음
  - player 들의 update 메서드들을 호출해줌

---

### class OddBettingPlayer

- update( int diceNumber ) : void
  - diceNumber 가 홀수일 경우 자신이 이겼다는 메시지 출력

---

### class EvenBettingPlayer

- update( int diceNumber ) : void
  - diceNumber 가 짝수일 경우 자신이 이겼다는 메시지 출력

---

### 느낀점

- 변화에 관심있는 관찰자들에게 update 메서드를 통해 알림을 보냄


- DOM 에서 값이 변경될때 알림을 줘야할 경우 생각보다 많이 사용되겠는데...?


- 에디터에서 각 tool 의 데이터가 변경될때, 
  - 외부나 다른 모듈에 알림을 줘야자늠...
  - 이때 많이 사용하면 될듯


- notificationObserver 를 썼었는데 각 객체에서 


- 일일히 등록하는게 아니라 해당 메서드를 observer( DiceGame ) 내부에서 호출하도록 하는게 더 좋겠네