### Composite 패턴( 컴포지트 패턴 )

- 컴포지트 패턴은 단일체와 집합체를 하나의 동일한 개념으로 처리하기 위한 패턴


- **즉, 여러 객체를 같은 Type 으로 처리할 수 있는 패턴**


- Composite 패턴은 단일체와 집합체를 동일한 개념으로 처리하다보니 재귀가 많이 쓰인다


- 예) 
  - File : 단일체
  - Folder : 집합체


- Folder 안에는 1개 이상의 File 이 존재할 수 있고, Folder 안에 또다른 Folder 가 존재할 수 있다


- Folder 와 File 을 동일한 개념으로 처리하기 위해 Unit 이라는 class 를 상속받도록 한다
  - ( Folder 는 여러개의 유닛을 가질 수 있다 )

---

### abstract class Unit

- getSize() : int
  - 추상 메서드인 이유 : file 과 folder 의 용량을 얻는 방법이 다르기 때문이다
  - file : 자신의 용량 반환
  - folder : 자신이 포함한 file , folder 들의 용량을 모두 더해서 반환

---

### class Folder

- unitList : LinkedList<Unit>
  - 자신이 가지고 있을 Unit 들의 필드


- getSize() : int
  - 자신이 가지고 있는 모든 file , folder 의 용량을 합해서 반환


- add() : boolean
  - Unit 객체를 추가시킬 수 있는 메서드
  - ( 포함한 항목을 제거할 수 있는 메서드도 추가하면 좋다 )


- list() : void;
  - 자신이 포함한 Unit 들을 출력해주는 메서드

---

### 느낀점

- 이거 느낌이 자료구조 Tree 느낌이나는데...?


- 와 이거머리좋네... 이렇게 재귀로 tree 를 그리면 
  - 재사용할 수 있는 getSize 메서드도 나오고, 출력용 list 메서드도 나오는데
  - 객체들의 타입들이 Unit 으로 통일되어 있어서 같은 처리를 할 수 있구나


- 인터페이스를 통일해서 Tree 를 계속해서 이어갈수 있게 하는구나