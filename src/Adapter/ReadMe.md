### Adapter 패턴( 어댑터 패턴 )

- 어떤 클래스를 사용해야하는데, 해당 클래스를 변경할 수 없을 경우,


- Adapter 패턴을 사용해서 사용할 수 있도록 해준다

---

### abstract class Animal

- User 에서 사용하는 추상 class


- name 필드가 필요하기에 인터페이스가아닌, 추상 클래스로 정의함

---

### class Dog

- abstract class Animal 실제 구현체 

---

### class Cat

- abstract class Animal 실제 구현체

---

### class Tiger

- 변경할 수 없는 class 인데 독자적으로 돌아가는 class
  - ( 인터페이스가 다름 )

---

### class TigerAdapter

- abstract class Animal 를 상속받고 Tiger 를 만들엗 연결시켜줌

---

### class MainEntry

- Animal 을 사용하는 class

---

### 느낀점

- 하나의 서비스에서 다른 서비스를 이용할때, adapter 로 넣어주면 좋겠네


- 오, 이번 에디터 데이터 구조 개선할때 Adapter 패턴을 사용하면 되지않을까...?


- 새로운 데이터 구조에 각각 tool 들을 Adapter 로 연결시켜서 넣어주는거지!!


