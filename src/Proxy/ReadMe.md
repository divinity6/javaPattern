### Proxy 패턴( 프록시 패턴 )

- Proxy 의 뜻은 대리인


- 어떤 작업의 실행을 대리인을 통해 간접적으로 실행하도록 하는 패턴


- proxy 사용처 :
  - 새로운 요청이 들어왔을 경우 들어온 요청이 이전요청과 동일하다면,
  - 다시 그 요청을 처리하는 객체를 호출하지 않고,
  - 캐시에 저장해둔 결과를 바로 전달 해주는등
  - ( 속도 향상 및 CPU 자원 절약 가능 )

---

### Diagram

- ScreenDisplay
  - 어떤 문자열을 화면에 출력해주는 기능


- BufferDisplay
  - Proxy 에 해당
  - 문자열을 출력할때, ScreenDisplay 객체를 바로 사용하는 대신,
  - BufferDisplay 객체를 사용한다


- Display
  - BufferDisplay 와 ScreenDisplay 를 하나의 타입으로 처리할 수 있게 한다
  - Display 인터페이스만 파악하면되기 때문에, 훨씬 빠르게 시스템을 이해할 수 있다


- 시스템이 관계를 맺을때, BufferDisplay 나 ScreenDisplay 와 관계를 맺는 것이 아닌,


- Display 인터페이스와 관계를 맺기 때문에 훨씬 단순해진다

---

### interface Display

- print( content : String ) : void
  - 화면에 해당 문자열을 출력

---

### class ScreenDisplay

- Display 를 구현하는 ScreenDisplay class

- print( String : content ) : void
  - 화면에 문자열을 출력하기 위해 많은 작업이 소요된다고 가정
  - 화면에 출력할때 시간이 소요됨

---

### class BufferDisplay

- buffer : ArrayList<String>
  - 문자열들을 담아둘 array 객체


- screen : ScreenDisplay
  - 실제 출력을 수행할 class

- bufferSize : int
  - 문자열이 몇개 모였을 경우 출력할지 갯수 


- flush() : void
  - 실제 출력동작을 수행할 screen 객체가 생성되어 있지 않다면 생성해주고,
  - buffer 에 대한 전처리를 수행하고, screen 객체의 print 메서드를 호출해준다
  - 그 후 buffer 를 지워준다


- print( content : String ) : void;
  - buffer 에 해당 content 를 추가하고, bufferSize 이상의 문자열이 들어온다면,
  - flush() 메서드를 호출한다

---

### 느낀점

- 어떤 일을 처리해야할 때, 곧바로 처리하지 않고, 중간에 대리인을 두어,
  - 그 객체가 추가처리하도록 하는 패턴으로 보임
  - 여기에서는 성능향상 목적으로 사용했음


- JS 의 proxy 와 역할은 똑같네...


- 이거는 에디터든 어디든 사용처가 많음
  - 예를들어, 데이터 구조가 변경되게 될 경우,  
  - 중간에 Proxy 객체를 추가해 이전 데이터로 변경할 수 있게 만들 수 있음
