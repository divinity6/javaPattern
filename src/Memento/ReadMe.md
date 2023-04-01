### Memento 패턴

- Memento 의 뜻은 "추억", "과거의 기억"


- 객체의 상태를 기억해 두었다가 필요할때 기억해둔 상태로 객체를 되돌린다


- 객체의 상태에 대한 기억은 다른 객체에서도 읽기 전용으로 접근할 수 있다
  - 기억을 조작할 순 없으므로 변경할 수 없어야 한다


- 객체의 상태에 대한 기억에 대한 생성은 오직 해당 객체만 할 수 있다
  - 다른 곳에서 엉뚱한 기억을 생성할 수 없도록 해야한다


- 즉, 기억에 대한 생성은 당사자만 하고, 다른 객체에 읽기 전용으로 공유해야 한다

---

### class Walker

- 취할 수 있는 액션, 위 , 아래 , 왼, 오른쪽으로 이동


- currentX , currentY : int
  - 현재 위치에 대한 좌표


- targetX , targetY : int
  - Walker 가 도달해야할 목표 좌표


- actionList : ArrayList<String>
  - 시작 좌표에서 목표좌표로 가기위해서 어떤 액션을 취해야하는지 저장


- walk( action : String ) : double
  - action 값에 따라 저장된 좌표값을 증가, 감소시키고
  - 현재 거리부터 목표 거리까지의 남은값을 반환한다



- createMemento() : Memento
  - memento 객체를 생성하고, memento 객체의 좌표값을, 현재 좌표값으로 설정


- restoreMemento( Memento : memento ) : void
  - memento 객체를 통해 Walker 의 좌표를 변경하는 메서드
  - 즉, memento 에 기억해둔 상태를 이용해 Walker 를 되돌려주는 메서드

---

### class Memento

- Walker class 의 inner Class 


- Memento 객체를 오직 walker Class 에서만 생성할 수 있도록하고, 


- Walker class 만이 Memento Class 의 필드를 변경할 수 있도록 하기위함이다


---

- 출력을 보면 점점 목표위치에 가까워지고, 가까워지기까지 어떤 액션을 취했는지 확인할 수 있다


- walker 와 memento 객체를 보면 memento 객체는 반드시 walker 를 통해서만 생성할 수 있다

---

### 느낀점

- History 내역을 저장하거나, 어떤 사용자의 행동을 추적할때 사용하면 매우 유용할 것으로 추정됨


- 위 예제에서는 해당 거리까지 이동을 하는데, 멀어지면, 자동으로 기억해둔 위치로 돌아가도록 만든 코드임
  - ( 즉, 무조건 가까워질 수 밖에 없는 코드 )

- 에디터내에서 사용자의 행동들을 기록해두고 서버에 전달할때 사용하거나, 서버에서 저장할때 사용하면 좋을 패턴으로 보임
  - ( Undo , Redo 랑은 다른게, 사용자의 행동을 기록해두는 거에 주안점을 두는거지... )