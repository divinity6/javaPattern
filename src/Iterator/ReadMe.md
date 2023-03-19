### Iterator 패턴

- 동일한 데이터 항목을 여러개 가지고 있는 것을 **Container / Aggregator** 라고 부른다
  - Array
  - Linked List
  - Tree
  - Graph
  - Table( DBMS )
  - ...


- Aggregator 의 데이터를 하나씩 가져와야할때, Aggregator 의 종류에 따라, 그방법이 다를수 밖에 없다
  - 내부 자료구조가 그 종류에 따라 모두 다르기 때문


- 그럴 경우, 하나의 통일된 방법으로 구성 데이터를 가져오기 위해 사용할 수 있는 패턴이 Iterator 패턴이다


---

### interface Aggregator

- Aggregator 클래스에서 Iterator() 메서드가 Iterator 객체를 생성해 반환해주는 메서드이다


---

### interface Iterator

- **next() : boolean**
  - next 메서드는 Iterator 의 인터페이스를 통해서 Aggregator 의 다음 data 를 반환한다
  - 다음 data 를 받을 수 있다면 true 를 반환하고, 더 이상 받을 수 없다면 false 를 반환한다

- **current() : Object**
  - current 메서드는 Aggregator 의 데이터 하나를 반환한다

---

### class item

- toString 을 오버라이드 해서 name 과 cost 를 같이 출력하도록 설정해두었음

---

### class Array

- 해당 클래스는 Aggregator 인터페이스를 구현해야 한다


- getItem 과 getCount 메서드는, Iterator 인터페이스의 구현 클래스인, ArrayIterator 클래스에서 사용된다


- **iterator() : Iterator** 
  - ArrayIterator 객체를 생성하여 반환
  - 파라미터로 this( instance )를 넘겨줌

---

### class ArrayIterator

- 해당 클래스는 Iterator 인터페이스를 구현한다


- ArrayIterator 에서 Array 객체를 참조해야하므로, 필드로 만든다


- **constructor( Array array )**
  - class Array 를받고, index 의 초기값으로 -1 을 지정해둠


- **next() : boolean**
  - iterator 인터페이스 구현
  - index 를 증가시키고, array 유효성 여부를 반환


- **current() : Object**
  - iterator 인터페이스 구현
  - 현재 index 에 해당하는 item 을 반환

---

### class MainEntry

- 실제 실행해주는 class


- iterator 를 받아와서 실행함


- 순차적으로 구성데이터들이 출력됨

---

### 느낀점

- Iterator 패턴의 핵심은 Array, linkedList, Tree 등과 같은 


- 다양한 형태의 Container( Aggregator )의 구성데이터를 참조할 수 있는 공통 API 를 제공할 수 있다는 점이다


- 즉, 다양한 데이터 구조를 파악하지 않더라도, 표준화된 한개의 API 만으로 다양한 구조의 데이터들을 참조할 수 있음
  - 위의 **array.iterator()** 로 해서 **next(), current()** 를 쓴 것처럼...


- 그냥 자바스크립트의 Iterator 메서드랑 구현은 똑같은데... 자바는 붙여야할 코드들이 많구만...
  - 좋게말하면 규칙적인거고, 나쁘게 말하면 너무 코드가 길어짐...