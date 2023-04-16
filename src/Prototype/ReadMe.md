### Prototype 패턴( 프로토타입 패턴 )

- 실행 중에 생성된 객체로 다른 객체를 생성하는 패턴
  - 보통은 new 로 새로운 객체를 생성하지만, 
  - prototype 패턴은 이미 생성된 객체를 이용해 독립된 객체를 생성하는 패턴


- Prototype 으로 만든 객체의 상태를 변경해도 원본 객체의 상태는 변경되지 않음
  - ( Deep Copy; 깊은 복사 )


- 새로운 클래스를 정의하지 않고도, 기존의 객체들을 조합해서 새로운 객체를 생성할 수 있다

---

### Diagram


- interface Prototype
  - 객체로부터 새로운 객체를 생성해내는 API 를 가지고 있다


- interface Shape
  - 도형과 관련된 API 를 가지고 있다


- class Point, Line , Group
  - 구체적인 도형 클래스들
  - 모두 Prototype , Shape 를 구현하고 있다


- class Group 
  - Shape 인터페이스를 여러개 가질 수 있는 class
  - 다른 객체를 이용하여 새로운 객체를 생성하는 class
  - Point , Line 클래스를 이용하여 사각형 class 를 생성할 수 있다

---

### interface Prototype

- copy() : Object
  - 새로운 객체를 복사해서 생성하는 메서드
  - 반환타입은 최상위 타입으로 지정하는게 일반적
  - 해당 객체의 값을 복사해서 새로운 객체로 반환함

---

### interface Shape

- draw() : String
  - 도형을 표현하는 문자열을 반환하는 메서드

- moveOffset( dx : int , dy : int ) : void
  - 도형을 일정한 거리만큼 이동시키는 메서드

---

### class Point

- x, y : int
  - point 의 좌표를 나타내는 필드


- setX( x : int ) : Point , setY( y : int ) : Point
  - point x, y 의 좌표를 설정하는 메서드


- getX() : int , getY() : int
  - point 의 필드값을 얻을수 있는 메서드

---

### class Line

- startPt, endPt : Point
  - 선의 시작점과 끝점에 대한 필드


- setStartPoint( pt : Point ) : Line, setEndPoint( pt : Point ) : Line
  - 시작점과 끝점을 설정할 수 있는 메서드


- getStartPoint() : Point , getEndPoint() : Point
  - 시작점과 끝점을 얻을 수 있는 메서드


- copy() : Object
  - Point 클래스의 copy 메서드를 이용하여 DeepCopy 를 하여 생성
  - 원본이나, 복사본을 변경해도 서로 영향을 끼치지 않음

---

### class Group

- shapeList : ArrayList<Shape>
  - group 객체가 가질, shape 객체들을 저장한 필드


- name : String
  - 해당 Group 의 이름


- addShape( shape : Shape ) : Group
  - group 을 구성하는 도형객체를 추가하는 메서드


- copy() : Object
  - 원본이가진 모든 도형객체를 copy 메서드로 깊은 복사를 한후 반환


- draw() : String
  - Group 이 가지고 있는 모든 도형들의 draw 메서드를 호출해,
  - 결괏값을 생성해 반환


---

### 느낀점

- 이제보니깐, Point 를 이용해서 Line 을 만드네...
  - 그치, 점 이 모여 선이되게할려고하니깐...


- Group 의 경우에는 point 나, line 들을 가지고 그룹으로 묶어서 만들고...


- 해당 객체를 복사하여 독립적으로 사용할 수 있게 할때 쓰는구나
  - JS 에서 prototype 으로 생성해주는 패턴이네.
  - 배열을 만들면, Array 를 복사해서 맨드는 것처럼...
  - 단지, JS Prototype 은 원본의 메서드를 참조형태로 추가해주는 체인이 추가된거로군


- 깊은 **복사 장치를 제공**해주는 것이 Prototype 패턴의 중요한 점이다!

